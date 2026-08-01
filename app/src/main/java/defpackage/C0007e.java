package defpackage;

import android.media.AudioManager;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؐ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0007e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f1136e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1137e;

    public /* synthetic */ C0007e(PlaybackService playbackService, int i) {
        this.f1137e = i;
        this.f1136e = playbackService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1137e;
        boolean z = true;
        PlaybackService playbackService = this.f1136e;
        switch (i) {
            case 0:
                C1511e c1511e = playbackService.f36739e;
                if (c1511e == null) {
                    c1511e = null;
                }
                if (c1511e.purchase && AbstractC16524e.amazon.ad() == EnumC9702e.f19200e) {
                    C1511e c1511e2 = playbackService.f36739e;
                    if ((c1511e2 != null ? c1511e2 : null).appmetrica) {
                        z = ((Boolean) AbstractC16524e.loadAd.ad()).booleanValue();
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                C1511e c1511e3 = playbackService.f36739e;
                if ((c1511e3 == null ? null : c1511e3).purchase) {
                    if (!(c1511e3 != null ? c1511e3 : null).appmetrica) {
                        z = ((Boolean) AbstractC16524e.loadAd.ad()).booleanValue();
                    }
                } else {
                    z = (c1511e3 != null ? c1511e3 : null).appmetrica;
                }
                return Boolean.valueOf(z);
            case 2:
                int i2 = PlaybackService.f36732e;
                return new C14863e(playbackService.getApplicationContext());
            case 3:
                int i3 = PlaybackService.f36732e;
                return new C3446e(playbackService.getApplicationContext(), playbackService.getPackageManager());
            case 4:
                int i4 = PlaybackService.f36732e;
                return (AudioManager) playbackService.getSystemService("audio");
            default:
                int i5 = PlaybackService.f36732e;
                return new C15113e(playbackService.getApplicationContext(), new C12916e(0, playbackService));
        }
    }
}
