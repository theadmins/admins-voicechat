package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.events.MicrophonePacketEvent;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;

public class MicrophonePacketEventImpl extends PacketEventImpl<MicrophonePacket> implements MicrophonePacketEvent {

    public MicrophonePacketEventImpl(VoicechatServerApi api, MicrophonePacket packet, VoicechatConnection connection) {
        super(api, packet, connection, null);
    }
}
