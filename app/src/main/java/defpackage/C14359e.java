package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioLyricsContainer;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14359e implements InterfaceC8152e {
    public static final C14359e ad = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [eِٖۢ, java.lang.Object] */
    @Override // defpackage.InterfaceC8152e
    public final Object ad(C9398e c9398e, AbstractC16049e abstractC16049e, InterfaceC5083e interfaceC5083e) {
        Throwable th;
        String str;
        ?? r7;
        if (abstractC16049e instanceof AudioTrack) {
            AudioTrack audioTrack = (AudioTrack) abstractC16049e;
            C10675e startapp = AbstractC4224e.startapp(4, AbstractC6914e.billing(audioTrack));
            C10675e startapp2 = AbstractC4224e.startapp(5, AbstractC6914e.billing(audioTrack));
            C18511e c18511e = AbstractC11062e.f21949e;
            AudioLyricsContainer th2 = null;
            if (c18511e.isVip(startapp)) {
                C13197e c13197e = new C13197e(c18511e.mo1918implements(startapp));
                try {
                    C14172e c14172e = VKXApplication.f36533e;
                    c14172e.getClass();
                    AudioLyricsContainer audioLyricsContainer = (AudioLyricsContainer) c14172e.vip(AudioLyricsContainer.class, AbstractC7644e.ad, null).ad(c13197e);
                    try {
                        c13197e.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    AudioLyricsContainer audioLyricsContainer2 = th2;
                    th2 = audioLyricsContainer;
                    r7 = audioLyricsContainer2;
                } catch (Throwable th4) {
                    try {
                        c13197e.close();
                        r7 = th4;
                    } catch (Throwable th5) {
                        AbstractC13362e.license(th4, th5);
                        r7 = th4;
                    }
                }
                if (r7 != 0) {
                    throw r7;
                }
                if (th2 == null) {
                    return C2471e.INSTANCE;
                }
                InterfaceC2558e metrica = C1587e.metrica(th2);
                AbstractC11062e.f21949e.loadAd(startapp, false);
                return metrica;
            }
            if (c18511e.isVip(startapp2)) {
                InterfaceC2537e mo1918implements = c18511e.mo1918implements(startapp2);
                ?? obj = new Object();
                try {
                    obj.mo2629class(mo1918implements);
                    str = obj.m4132protected();
                    try {
                        ((C5476e) mo1918implements).close();
                        obj.ad();
                        th = null;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        ((C5476e) mo1918implements).close();
                        obj.ad();
                    } catch (Throwable th8) {
                        AbstractC13362e.license(th7, th8);
                    }
                    th = th7;
                    str = null;
                }
                if (th != null) {
                    throw th;
                }
                C10874e c10874e = new C10874e(str, null);
                AbstractC11062e.f21949e.loadAd(startapp2, false);
                return c10874e;
            }
        }
        return C2471e.INSTANCE;
    }
}
