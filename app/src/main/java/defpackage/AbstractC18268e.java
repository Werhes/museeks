package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18268e {
    public static final C2892e ad = new C2892e(-617673835, false, new C11402e(14));
    public static final C2892e vip = new C2892e(389007412, false, new C11402e(15));
    public static final C2892e metrica = new C2892e(401322129, false, new C11402e(16));

    public static final void ad(InterfaceC12864e interfaceC12864e, InterfaceC10260e interfaceC10260e, InterfaceC6428e interfaceC6428e, int i, C2892e c2892e, C13770e c13770e, int i2) {
        int i3;
        Object obj;
        C14544e c14544e = C5438e.f11685e;
        c13770e.m3671package(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.purchase(interfaceC10260e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.purchase(interfaceC6428e) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c13770e.purchase(c14544e) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c13770e.license(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c13770e.license(Alert.DURATION_SHOW_INDEFINITELY) ? 131072 : 65536;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c13770e.yandex(c2892e) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (c13770e.m3673protected(i4 & 1, (i4 & 4793491) != 4793490)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj2 = C2987e.ad;
            if (m3681throw == obj2) {
                m3681throw = new Object();
                c13770e.m3682throws(m3681throw);
            }
            C6682e c6682e = (C6682e) m3681throw;
            int i5 = i4 >> 3;
            boolean purchase = ((((i5 & 14) ^ 6) > 4 && c13770e.purchase(interfaceC10260e)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && c13770e.purchase(interfaceC6428e)) || (i5 & 48) == 32) | ((((i5 & 896) ^ 384) > 256 && c13770e.purchase(c14544e)) || (i5 & 384) == 256) | ((((i5 & 7168) ^ 3072) > 2048 && c13770e.license(i)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && c13770e.license(Alert.DURATION_SHOW_INDEFINITELY)) || (i5 & 24576) == 16384) | c13770e.purchase(c6682e);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj2) {
                obj = obj2;
                Object c0699e = new C0699e(interfaceC10260e, interfaceC6428e, interfaceC10260e.appmetrica(), new C7560e(c14544e), interfaceC6428e.appmetrica(), i, c6682e);
                c13770e.m3682throws(c0699e);
                m3681throw2 = c0699e;
            } else {
                obj = obj2;
            }
            C0699e c0699e2 = (C0699e) m3681throw2;
            boolean z = ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object m3681throw3 = c13770e.m3681throw();
            Object obj3 = m3681throw3;
            if (z || m3681throw3 == obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C2892e(-1192950673, true, new C7099e(c2892e, 7)));
                AbstractC8703e.m2467class(2);
                c13770e.m3682throws(arrayList);
                obj3 = arrayList;
            }
            C2892e metrica2 = AbstractC16653e.metrica((List) obj3);
            boolean purchase2 = c13770e.purchase(c0699e2);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase2 || m3681throw4 == obj) {
                m3681throw4 = new C3045e(c0699e2);
                c13770e.m3682throws(m3681throw4);
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw4;
            long j = c13770e.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, interfaceC2747e, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase3, C2721e.license);
            metrica2.invoke(c13770e, 0);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3015e(interfaceC12864e, interfaceC10260e, interfaceC6428e, i, c2892e, i2);
        }
    }

    public static void appmetrica(InterfaceC2235e interfaceC2235e, AbstractC14073e abstractC14073e, long j) {
        boolean z = abstractC14073e instanceof C14340e;
        C6590e c6590e = C6590e.ad;
        if (z) {
            C0763e c0763e = ((C14340e) abstractC14073e).appmetrica;
            float f = c0763e.ad;
            float f2 = c0763e.vip;
            interfaceC2235e.mo781e(j, (4294967295L & Float.floatToRawIntBits(f2)) | (Float.floatToRawIntBits(f) << 32), billing(c0763e), 1.0f, c6590e, null, 3);
            return;
        }
        if (!(abstractC14073e instanceof C2904e)) {
            if (!(abstractC14073e instanceof C10435e)) {
                throw new C14803e(10);
            }
            interfaceC2235e.mopub(((C10435e) abstractC14073e).appmetrica, j, 1.0f, c6590e);
            return;
        }
        C2904e c2904e = (C2904e) abstractC14073e;
        C17985e c17985e = c2904e.purchase;
        if (c17985e != null) {
            interfaceC2235e.mopub(c17985e, j, 1.0f, c6590e);
            return;
        }
        C2330e c2330e = c2904e.appmetrica;
        float intBitsToFloat = Float.intBitsToFloat((int) (c2330e.yandex >> 32));
        float f3 = c2330e.ad;
        float f4 = c2330e.vip;
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        float vip2 = c2330e.vip();
        float ad2 = c2330e.ad();
        interfaceC2235e.mo783import(j, floatToRawIntBits, (Float.floatToRawIntBits(vip2) << 32) | (Float.floatToRawIntBits(ad2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), c6590e);
    }

    public static final long billing(C0763e c0763e) {
        float f = c0763e.metrica - c0763e.ad;
        float f2 = c0763e.license - c0763e.vip;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void license(C4017e c4017e, AbstractC14073e abstractC14073e, AbstractC4457e abstractC4457e, float f, AbstractC4970e abstractC4970e, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        AbstractC4970e abstractC4970e2 = (i & 8) != 0 ? C6590e.ad : abstractC4970e;
        if (abstractC14073e instanceof C14340e) {
            C0763e c0763e = ((C14340e) abstractC14073e).appmetrica;
            float f3 = c0763e.ad;
            c4017e.mo780e(abstractC4457e, (Float.floatToRawIntBits(c0763e.vip) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), billing(c0763e), f2, abstractC4970e2, null, 3);
            return;
        }
        if (!(abstractC14073e instanceof C2904e)) {
            if (!(abstractC14073e instanceof C10435e)) {
                throw new C14803e(10);
            }
            c4017e.mo784synchronized(((C10435e) abstractC14073e).appmetrica, abstractC4457e, f2, abstractC4970e2, null, 3);
            return;
        }
        C2904e c2904e = (C2904e) abstractC14073e;
        C17985e c17985e = c2904e.purchase;
        if (c17985e != null) {
            c4017e.mo784synchronized(c17985e, abstractC4457e, f2, abstractC4970e2, null, 3);
            return;
        }
        C2330e c2330e = c2904e.appmetrica;
        float intBitsToFloat = Float.intBitsToFloat((int) (c2330e.yandex >> 32));
        float f4 = c2330e.ad;
        c4017e.mo785throws(abstractC4457e, (Float.floatToRawIntBits(c2330e.vip) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(c2330e.vip()) << 32) | (Float.floatToRawIntBits(c2330e.ad()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f2, abstractC4970e2, null, 3);
    }

    public static final void metrica(C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1083287017);
        if (c13770e2.m3673protected(i & 1, i != 0)) {
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11668e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC8461e.ad(Integer.valueOf(R.drawable.logo_vkx_color_32), null, AbstractC18007e.startapp(c0115e, 36), null, null, c13770e2, 432, 2040);
            AbstractC10600e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.app_name), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e2.adcel(AbstractC17878e.ad)).purchase, c13770e, 0, 0, 65534);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C14151e(i);
        }
    }

    public static final int purchase(C17548e c17548e, Object obj, int i) {
        int i2 = c17548e.f34401e;
        if (i2 == 0) {
            return -1;
        }
        try {
            int metrica2 = AbstractC10115e.metrica(i2, i, c17548e.f34403e);
            if (metrica2 < 0 || AbstractC7890e.billing(obj, c17548e.f34402e[metrica2])) {
                return metrica2;
            }
            int i3 = metrica2 + 1;
            while (i3 < i2 && c17548e.f34403e[i3] == i) {
                if (AbstractC7890e.billing(obj, c17548e.f34402e[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = metrica2 - 1; i4 >= 0 && c17548e.f34403e[i4] == i; i4--) {
                if (AbstractC7890e.billing(obj, c17548e.f34402e[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final void vip(InterfaceC12864e interfaceC12864e, final InterfaceC10260e interfaceC10260e, InterfaceC6428e interfaceC6428e, C14544e c14544e, int i, int i2, final C2892e c2892e, C13770e c13770e, final int i3, final int i4) {
        int i5;
        final InterfaceC12864e interfaceC12864e2;
        final InterfaceC6428e interfaceC6428e2;
        final int i6;
        final int i7;
        c13770e.m3671package(-1303174015);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c13770e.purchase(interfaceC10260e) ? 32 : 16;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= c13770e.purchase(interfaceC6428e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i10 = i5 | 3072;
        int i11 = i4 & 16;
        if (i11 != 0) {
            i10 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            i10 |= c13770e.license(i) ? 16384 : 8192;
        }
        int i12 = i10 | 196608;
        if (c13770e.m3673protected(i12 & 1, (599187 & i12) != 599186)) {
            if (i8 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            InterfaceC12864e interfaceC12864e3 = interfaceC12864e;
            if (i9 != 0) {
                interfaceC6428e = AbstractC16497e.metrica;
            }
            InterfaceC6428e interfaceC6428e3 = interfaceC6428e;
            c14544e = C5438e.f11685e;
            int i13 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | 3072 | (i12 & 57344) | 12779520;
            int i14 = i11 != 0 ? Integer.MAX_VALUE : i;
            ad(interfaceC12864e3, interfaceC10260e, interfaceC6428e3, i14, c2892e, c13770e, i13);
            i7 = Integer.MAX_VALUE;
            interfaceC12864e2 = interfaceC12864e3;
            i6 = i14;
            interfaceC6428e2 = interfaceC6428e3;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            interfaceC6428e2 = interfaceC6428e;
            i6 = i;
            i7 = i2;
        }
        final C14544e c14544e2 = c14544e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eَٖۨ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC18268e.vip(InterfaceC12864e.this, interfaceC10260e, interfaceC6428e2, c14544e2, i6, i7, c2892e, (C13770e) obj, AbstractC5190e.advert(i3 | 1), i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
