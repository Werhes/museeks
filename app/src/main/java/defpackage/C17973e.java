package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17973e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f35228e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f35229e = 1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f35230e;

    public /* synthetic */ C17973e() {
        super(13, false);
    }

    public C17973e(C4748e c4748e) {
        super(13, false);
        this.f35228e = c4748e;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٖؓٚ */
    public final void mo1407e(C11467e c11467e) {
        switch (this.f35229e) {
            case 0:
                Notification.Builder builder = (Notification.Builder) c11467e.f23070e;
                Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
                C4748e c4748e = (C4748e) this.f35228e;
                Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((C2584e) c4748e.ad.yandex.amazon.f26645e).metrica.f27276e);
                int[] iArr = this.f35230e;
                if (iArr != null) {
                    mediaSession.setShowActionsInCompactView(iArr);
                }
                builder.setStyle(mediaSession);
                Bundle bundle = new Bundle();
                bundle.putBundle("androidx.media3.session", c4748e.ad.adcel.vip());
                builder.addExtras(bundle);
                return;
            default:
                Notification.Builder builder2 = (Notification.Builder) c11467e.f23070e;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC7343e.license(builder2, AbstractC7343e.vip(AbstractC12845e.ad(AbstractC7343e.ad(), null, 0, null, Boolean.FALSE), this.f35230e, (MediaSessionCompat$Token) this.f35228e));
                    return;
                } else {
                    AbstractC7343e.license(builder2, AbstractC7343e.vip(AbstractC7343e.ad(), this.f35230e, (MediaSessionCompat$Token) this.f35228e));
                    return;
                }
        }
    }
}
