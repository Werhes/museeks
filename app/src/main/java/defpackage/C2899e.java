package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.View;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2899e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6891e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6892e;

    public /* synthetic */ C2899e(int i, Object obj) {
        this.f6892e = i;
        this.f6891e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6892e;
        int i2 = 1;
        Object obj = this.f6891e;
        switch (i) {
            case 0:
                ((View) obj).invalidate();
                return Unit.INSTANCE;
            case 1:
                AbstractC18406e.appmetrica(new C13029e(((C2014e) obj).f5297e, 8));
                return Unit.INSTANCE;
            case 2:
                ((C0576e) obj).setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 3:
                ((C13372e) obj).f26633e.metrica(true);
                return Unit.INSTANCE;
            case 4:
                C15820e c15820e = (C15820e) obj;
                if (!AbstractC13406e.admob(c15820e.f31221e)) {
                    long j = c15820e.f31221e.applovin;
                    C14027e.ad.getClass();
                    if (j == C14027e.metrica()) {
                        AudioPlaylist audioPlaylist = c15820e.f31221e;
                        if (audioPlaylist.f36517protected == null && audioPlaylist.f36501break == null) {
                            return new C6571e(EnumC13401e.f26654e, new C16668e(c15820e, i2));
                        }
                    }
                }
                return null;
            case 5:
                C4600e c4600e = new C4600e(((C2095e) ((InterfaceC17396e) obj)).ad, 12);
                C5363e c5363e = C0308e.appmetrica;
                c4600e.vip = AbstractC18271e.metrica().license.pro();
                return c4600e;
            case 6:
                WebView webView = (WebView) obj;
                if (webView != null) {
                    webView.goBack();
                }
                return Unit.INSTANCE;
            case 7:
                return (AbstractC18174e) ((C8921e) obj).vip.getValue();
            default:
                Object metrica = ((C9000e) ((C17300e) obj).ad).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (metrica != null) {
                    return (StreamConfigurationMap) metrica;
                }
                throw new IllegalStateException("Required value was null.");
        }
    }
}
