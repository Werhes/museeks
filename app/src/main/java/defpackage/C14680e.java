package defpackage;

import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14680e {
    public final void ad(AbstractC16049e abstractC16049e) {
        if (abstractC16049e != null && (abstractC16049e instanceof AudioTrack)) {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            if (VKXApplication.Companion.metrica()) {
                C14027e.ad.getClass();
                if (C14027e.ad()) {
                    try {
                        if (((AudioTrack) abstractC16049e).appmetrica() == 2) {
                            AbstractC18406e.appmetrica(new C13029e((AudioTrack) null, 26));
                        } else {
                            AbstractC18406e.appmetrica(new C13029e((AudioTrack) abstractC16049e, 26));
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final void vip() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        if (VKXApplication.Companion.metrica()) {
            C14027e.ad.getClass();
            if (C14027e.ad()) {
                try {
                    AbstractC18406e.appmetrica(new C13029e((AudioTrack) null, 26));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused) {
                }
            }
        }
    }
}
