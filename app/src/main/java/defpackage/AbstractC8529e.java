package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8529e {
    public static float Signature(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static void ad(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    public static List<PlaybackState.CustomAction> adcel(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    public static long admob(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    public static Bundle advert(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static long amazon(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static PlaybackState.CustomAction.Builder appmetrica(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    public static long billing(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static void inmobi(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    public static void isVip(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static PlaybackState.Builder license() {
        return new PlaybackState.Builder();
    }

    public static CharSequence loadAd(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static PlaybackState metrica(PlaybackState.Builder builder) {
        return builder.build();
    }

    public static CharSequence mopub(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static void pro(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    public static String purchase(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static void remoteconfig(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    public static void signatures(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    public static int smaato(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static long startapp(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static int subscription(PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static void tapsense(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    public static PlaybackState.CustomAction vip(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    public static long yandex(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }
}
