package emu.grasscutter.game.dungeons;

import io.grasscutter.net.proto.define.TrialAvatarGrantRecord;
import java.util.List;
import lombok.*;

@Data
@AllArgsConstructor
public class DungeonTrialTeam {
    List<Integer> trialAvatarIds;
    TrialAvatarGrantRecord.GrantReason grantReason;
}
