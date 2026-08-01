package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0890e {
    public static final InterfaceC5372e[] ad = new InterfaceC5372e[0];

    public static final C0763e ad(InterfaceC0043e interfaceC0043e) {
        InterfaceC0043e isVip = interfaceC0043e.isVip();
        return isVip != null ? isVip.mo208goto(interfaceC0043e, true) : new C0763e(0.0f, 0.0f, (int) (interfaceC0043e.advert() >> 32), (int) (interfaceC0043e.advert() & 4294967295L));
    }

    public static C3566e appmetrica(AudioTrack audioTrack, Function0 function0) {
        return new C3566e(new C13372e(audioTrack, function0));
    }

    public static int billing(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }

    public static C3566e license(AudioTrack audioTrack) {
        return new C3566e(new C13372e(audioTrack, null));
    }

    public static final InterfaceC0043e metrica(InterfaceC0043e interfaceC0043e) {
        InterfaceC0043e interfaceC0043e2;
        InterfaceC0043e isVip = interfaceC0043e.isVip();
        while (true) {
            InterfaceC0043e interfaceC0043e3 = isVip;
            interfaceC0043e2 = interfaceC0043e;
            interfaceC0043e = interfaceC0043e3;
            if (interfaceC0043e == null) {
                break;
            }
            isVip = interfaceC0043e.isVip();
        }
        AbstractC17732e abstractC17732e = interfaceC0043e2 instanceof AbstractC17732e ? (AbstractC17732e) interfaceC0043e2 : null;
        if (abstractC17732e == null) {
            return interfaceC0043e2;
        }
        AbstractC17732e abstractC17732e2 = abstractC17732e.f34794e;
        while (true) {
            AbstractC17732e abstractC17732e3 = abstractC17732e2;
            AbstractC17732e abstractC17732e4 = abstractC17732e;
            abstractC17732e = abstractC17732e3;
            if (abstractC17732e == null) {
                return abstractC17732e4;
            }
            abstractC17732e2 = abstractC17732e.f34794e;
        }
    }

    public static final void purchase(C6071e c6071e, int i, C11053e c11053e) {
        C6071e c6071e2;
        C12431e c12431e = new C12431e(0, new C6071e[16]);
        List startapp = c6071e.startapp(false, false);
        while (true) {
            c12431e.purchase(c12431e.f24868e, startapp);
            while (true) {
                int i2 = c12431e.f24868e;
                if (i2 == 0) {
                    return;
                }
                c6071e2 = (C6071e) c12431e.amazon(i2 - 1);
                boolean billing = AbstractC0421e.billing(c6071e2);
                C0500e c0500e = c6071e2.license;
                C0583e c0583e = c0500e.f2578e;
                if (!billing && !c0583e.metrica(AbstractC9058e.adcel)) {
                    AbstractC17732e license = c6071e2.license();
                    if (license == null) {
                        throw AbstractC8703e.Signature("Expected semantics node to have a coordinator.");
                    }
                    C10163e purchase = AbstractC18366e.purchase(vip(license, true));
                    if (purchase.ad < purchase.metrica && purchase.vip < purchase.license) {
                        Object billing2 = c0500e.f2578e.billing(AbstractC10789e.appmetrica);
                        if (billing2 == null) {
                            billing2 = null;
                        }
                        Function2 function2 = (Function2) billing2;
                        Object billing3 = c0583e.billing(AbstractC9058e.isVip);
                        C9585e c9585e = (C9585e) (billing3 != null ? billing3 : null);
                        if (function2 != null && c9585e != null && ((Number) c9585e.vip.invoke()).floatValue() > 0.0f) {
                            int i3 = 1 + i;
                            c11053e.invoke(new C8201e(c6071e2, i3, purchase, license));
                            purchase(c6071e2, i3, c11053e);
                        }
                    }
                }
            }
            startapp = c6071e2.startapp(false, false);
        }
    }

    public static final C0763e vip(InterfaceC0043e interfaceC0043e, boolean z) {
        InterfaceC0043e metrica = metrica(interfaceC0043e);
        float advert = (int) (metrica.advert() >> 32);
        float advert2 = (int) (metrica.advert() & 4294967295L);
        C0763e mo208goto = metrica.mo208goto(interfaceC0043e, z);
        float f = mo208goto.license;
        float f2 = mo208goto.metrica;
        float f3 = mo208goto.vip;
        float f4 = mo208goto.ad;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > advert) {
                f4 = advert;
            }
        }
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > advert2) {
                f3 = advert2;
            }
        }
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 <= advert) {
                advert = f2;
            }
            f2 = advert;
        }
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f <= advert2) {
                advert2 = f;
            }
            f = advert2;
        }
        if (f4 == f2 || f3 == f) {
            return C0763e.appmetrica;
        }
        long license = metrica.license((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long license2 = metrica.license((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long license3 = metrica.license((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        long license4 = metrica.license((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (license >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (license2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (license4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (license3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (license & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (license2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (license4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (license3 & 4294967295L));
        return new C0763e(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }
}
