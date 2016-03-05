package com.maxkrass.appreciate.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maxkrass.appreciate.R;
import com.maxkrass.appreciate.objects.MatchRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Max made this for APPreciate on 11.01.2016.
 */
public class MatchCardAdapter extends RecyclerView.Adapter<MatchCardAdapter.MatchCardViewHolder> {

	LayoutInflater inflater;
	List<MatchRecord> matchRecords = Collections.emptyList();


	public MatchCardAdapter(Context context, List<MatchRecord> matchRecords) {
		inflater = LayoutInflater.from(context);
		this.matchRecords = matchRecords;
	}

	@Override
	public MatchCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new MatchCardViewHolder(inflater.inflate(R.layout.match_card, parent, false));
	}

	@Override
	public void onBindViewHolder(MatchCardViewHolder holder, int position) {
		MatchRecord matchRecord = matchRecords.get(position);
		holder.matchNumber.setText("Match " + String.valueOf(matchRecord.getMatchNumber()));
		holder.pointsAutoLabel.setText(String.valueOf(matchRecord.getAutoPoints()));
		holder.commentAutoLabel.setText(matchRecord.getAutoComment());
		holder.pointsTeleLabel.setText(String.valueOf(matchRecord.getTotalPoints()));
		holder.commentTeleLabel.setText(matchRecord.getTeleComment());

		String[] spinnerItems =inflater.getContext().getResources().getStringArray(R.array.defense);
		int[] spinnerIndexes = {8, matchRecord.getSpinner2(), matchRecord.getSpinner3(), matchRecord.getSpinner4(), matchRecord.getSpinner5()};

		int[] defenseTimes = {matchRecord.getDefense1(), matchRecord.getDefense2(), matchRecord.getDefense3(), matchRecord.getDefense4(), matchRecord.getDefense5()};
		int maxDefenseTimes = 0;
		String preferredDefense = "no defense passed";
		for(int i = 0; i< defenseTimes.length; i++)
		{
			if(defenseTimes[i] > maxDefenseTimes)
			{
				maxDefenseTimes =defenseTimes[i];
				preferredDefense = spinnerItems[spinnerIndexes[i]];
			}
		}
		holder.preferredDefenseLabel.setText(preferredDefense);

		if(matchRecord.getReachedDefense())
		{
			holder.defensePassedLabel.setText(spinnerItems[matchRecord.getDefenseSpinner()]);
		}
		else
		{
			holder.defensePassedLabel.setText("None");
		}

		if(matchRecord.getHighGoalAuto() >0)
		{
			holder.autoShotLabel.setText("High");
		}
		else if(matchRecord.getLowGoalAuto() > 0)
		{
			holder.autoShotLabel.setText("Low");
		}
		else
		{
			holder.autoShotLabel.setText("None");
		}

		if(matchRecord.getAutoSpy())
		{
			holder.spyLabel.setText("Yes");
		}
		else
		{
			holder.spyLabel.setText("No");
		}

		int highShots = 0;
		int lowShots = 0;
		int missShots = 0;

		if(matchRecord.getShots() != null)
		{
			for (String shot : matchRecord.getShots())
			{
				char shotChar = shot.charAt(1);
				if(shotChar == 'H')
				{
					highShots++;
				}
				else if(shotChar == 'L')
				{
					lowShots++;
				}
				else if(shotChar == 'M')
				{
					missShots++;
				}
				else
				{
					System.out.println("Error adding shot at goal " + shotChar);
				}
			}
			double totalShots = highShots + lowShots + missShots;
			int shootingAccuracy = (int)(((highShots + lowShots)/totalShots) * 100);
			holder.shootingAccuracyLabel.setText(shootingAccuracy + "%");

		}
		else
		{
			holder.shootingAccuracyLabel.setText("0%");
		}


		holder.teleopHighGoalLabel.setText(highShots + "");
		holder.teleopLowGoalLabel.setText(lowShots + "");
		holder.teleopMissLabel.setText(missShots + "");

		if(matchRecord.getScaleLeft())
		{
			holder.scaleLabel.setText("Left");
		}
		else if(matchRecord.getScaleRight())
		{
			holder.scaleLabel.setText("Right");
		}
		else if(matchRecord.getScaleMiddle())
		{
			holder.scaleLabel.setText("Middle");
		}
		else
		{
			holder.scaleLabel.setText("None");
		}

	}

	@Override
	public int getItemCount() {
		return matchRecords.size();
	}

	class MatchCardViewHolder extends RecyclerView.ViewHolder {

		TextView matchNumber;
		TextView pointsAutoLabel;
		TextView commentAutoLabel;
		TextView pointsTeleLabel;
		TextView commentTeleLabel;
		TextView preferredDefenseLabel;
		TextView defensePassedLabel;
		TextView autoShotLabel;
		TextView spyLabel;
		TextView teleopHighGoalLabel;
		TextView teleopLowGoalLabel;
		TextView teleopMissLabel;
		TextView shootingAccuracyLabel;
		TextView scaleLabel;

		public MatchCardViewHolder(View itemView) {
			super(itemView);
			matchNumber = (TextView) itemView.findViewById(R.id.match_number);
			pointsAutoLabel = (TextView) itemView.findViewById(R.id.points_auto_label);
			commentAutoLabel = (TextView) itemView.findViewById(R.id.comment_auto_label);
			pointsTeleLabel = (TextView) itemView.findViewById(R.id.points_total_label);
			commentTeleLabel = (TextView) itemView.findViewById(R.id.comments_tele_label);
			preferredDefenseLabel =(TextView)itemView.findViewById(R.id.preferred_defense_textview);
			defensePassedLabel = (TextView)itemView.findViewById(R.id.defense_passed_label);
			autoShotLabel = (TextView)itemView.findViewById(R.id.auto_shot_label);
			spyLabel = (TextView)itemView.findViewById(R.id.spy_label);
			teleopHighGoalLabel = (TextView)itemView.findViewById(R.id.teleop_high_goal_label);
			teleopLowGoalLabel = (TextView)itemView.findViewById(R.id.teleop_low_goal_label);
			teleopMissLabel = (TextView)itemView.findViewById(R.id.teleop_miss_label);
			shootingAccuracyLabel = (TextView)itemView.findViewById(R.id.shooting_accuracy_label);
			scaleLabel = (TextView)itemView.findViewById(R.id.scale_label);
		}
	}

}
