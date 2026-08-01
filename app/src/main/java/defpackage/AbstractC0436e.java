package defpackage;

import android.view.View;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٝؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0436e implements InterfaceC11206e {
    public static final void ad(InterfaceC12864e interfaceC12864e, boolean z, long j, C13770e c13770e, final int i, final int i2) {
        final InterfaceC12864e interfaceC12864e2;
        int i3;
        long j2;
        final boolean z2;
        final long j3;
        boolean z3;
        c13770e.m3671package(-86674598);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC12864e2 = interfaceC12864e;
        } else if ((i & 6) == 0) {
            interfaceC12864e2 = interfaceC12864e;
            i3 = (c13770e.purchase(interfaceC12864e2) ? 4 : 2) | i;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && c13770e.appmetrica(j2)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            j2 = j;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 131) != 130)) {
            c13770e.m3655case();
            int i5 = i & 1;
            C0115e c0115e = C0115e.f1276e;
            if (i5 == 0 || c13770e.isPro()) {
                if (i4 != 0) {
                    interfaceC12864e2 = c0115e;
                }
                boolean z4 = (i2 & 2) != 0 ? false : z;
                if ((i2 & 4) != 0) {
                    j2 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                    i3 &= -897;
                }
                z3 = z4;
            } else {
                c13770e.m3659default();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                z3 = z;
            }
            InterfaceC12864e interfaceC12864e3 = interfaceC12864e2;
            int i6 = i3;
            long j4 = j2;
            c13770e.admob();
            InterfaceC12864e premium = interfaceC12864e3.premium(AbstractC18007e.metrica);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j5 = c13770e.f27286case;
            int i7 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, premium);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i7), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC6232e.vip(C14486e.ad.ad(c0115e, C5438e.f11700e), j4, null, c13770e, (i6 >> 3) & 112, 4);
            c13770e.Signature(true);
            j3 = j4;
            interfaceC12864e2 = interfaceC12864e3;
            z2 = z3;
        } else {
            c13770e.m3659default();
            z2 = z;
            j3 = j2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؙؖۜ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0436e.ad(InterfaceC12864e.this, z2, j3, (C13770e) obj, AbstractC5190e.advert(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final InterfaceC16400e appmetrica(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC16400e interfaceC16400e = tag instanceof InterfaceC16400e ? (InterfaceC16400e) tag : null;
            if (interfaceC16400e != null) {
                return interfaceC16400e;
            }
            Object appmetrica = AbstractC9110e.appmetrica(view);
            view = appmetrica instanceof View ? (View) appmetrica : null;
        }
        return null;
    }

    public static byte[] billing(UUID uuid, byte[] bArr) {
        C9556e purchase = purchase(bArr);
        if (purchase == null) {
            return null;
        }
        UUID uuid2 = (UUID) purchase.f18968e;
        if (uuid.equals(uuid2)) {
            return (byte[]) purchase.f18967e;
        }
        AbstractC2803e.smaato("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static byte[] license(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static C7769e metrica(InterfaceC4895e interfaceC4895e, AbstractC11062e abstractC11062e) {
        return new C7769e(interfaceC4895e, abstractC11062e, null);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, eٌٍٚ] */
    public static C9556e purchase(byte[] bArr) {
        UUID[] uuidArr;
        C1292e c1292e = new C1292e(bArr);
        if (c1292e.metrica < 32) {
            return null;
        }
        c1292e.m571try(0);
        int ad = c1292e.ad();
        int smaato = c1292e.smaato();
        if (smaato != ad) {
            AbstractC2803e.smaato("PsshAtomUtil", "Advertised atom size (" + smaato + ") does not match buffer size: " + ad);
            return null;
        }
        int smaato2 = c1292e.smaato();
        if (smaato2 != 1886614376) {
            AbstractC10257e.pro("Atom type is not pssh: ", smaato2, "PsshAtomUtil");
            return null;
        }
        int appmetrica = AbstractC11004e.appmetrica(c1292e.smaato());
        if (appmetrica > 1) {
            AbstractC10257e.pro("Unsupported pssh version: ", appmetrica, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c1292e.signatures(), c1292e.signatures());
        if (appmetrica == 1) {
            int firebase = c1292e.firebase();
            uuidArr = new UUID[firebase];
            for (int i = 0; i < firebase; i++) {
                uuidArr[i] = new UUID(c1292e.signatures(), c1292e.signatures());
            }
        } else {
            uuidArr = null;
        }
        int firebase2 = c1292e.firebase();
        int ad2 = c1292e.ad();
        if (firebase2 != ad2) {
            AbstractC2803e.smaato("PsshAtomUtil", "Atom data size (" + firebase2 + ") does not match the bytes left: " + ad2);
            return null;
        }
        byte[] bArr2 = new byte[firebase2];
        c1292e.mopub(0, firebase2, bArr2);
        ?? obj = new Object();
        obj.f18968e = uuid;
        obj.f18970e = appmetrica;
        obj.f18967e = bArr2;
        obj.f18969e = uuidArr;
        return obj;
    }

    public static final void startapp(View view, InterfaceC16400e interfaceC16400e) {
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC16400e);
    }

    public static C15630e vip(C10675e c10675e, AbstractC11062e abstractC11062e, String str, C16885e c16885e, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            c16885e = null;
        }
        return new C15630e(c10675e, abstractC11062e, str, c16885e);
    }

    public static C2107e yandex(C2532e c2532e) {
        C2107e c2107e = (C2107e) ((InterfaceC6755e) c2532e.f6387e);
        AbstractC1513e.appmetrica(c2107e);
        return c2107e;
    }
}
