package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7861e implements InterfaceC4563e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15913e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f15911e = new C2892e(1268214212, false, new C13060e(25));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2892e f15910e = new C2892e(-1971964984, false, new C13060e(26));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2892e f15912e = new C2892e(-127950229, false, new C14123e(19));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2892e f15909e = new C2892e(-1425424680, false, new C14123e(20));

    public /* synthetic */ AbstractC7861e(int i) {
        this.f15913e = i;
    }

    public static final int adcel(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C4864e c4864e = (C4864e) list.get(i3);
            char c = c4864e.license > i ? (char) 1 : c4864e.appmetrica <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void advert(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int startapp = startapp(C12347e.billing(j), arrayList); startapp < size; startapp++) {
            C4864e c4864e = (C4864e) arrayList.get(startapp);
            if (c4864e.vip >= C12347e.purchase(j)) {
                return;
            }
            if (c4864e.vip != c4864e.metrica) {
                function1.invoke(c4864e);
            }
        }
    }

    public static final int billing(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final int mopub(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C4864e) AbstractC13480e.m3570break(arrayList)).billing) {
            return AbstractC6874e.billing(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C4864e c4864e = (C4864e) arrayList.get(i2);
            char c = c4864e.purchase > f ? (char) 1 : c4864e.billing <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int startapp(int i, List list) {
        int i2;
        int i3 = ((C4864e) AbstractC13480e.m3570break(list)).metrica;
        if (i > ((C4864e) AbstractC13480e.m3570break(list)).metrica) {
            AbstractC5525e.ad("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            C4864e c4864e = (C4864e) list.get(i2);
            char c = c4864e.vip > i ? (char) 1 : c4864e.metrica <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder premium = AbstractC4653e.premium("Found paragraph index ", i2, " should be in range [0, ");
        premium.append(list.size());
        premium.append(").\nDebug info: index=");
        premium.append(i);
        premium.append(", paragraphs=[");
        premium.append(AbstractC17404e.ad(list, null, new C3685e(16), 31));
        premium.append(']');
        AbstractC5525e.ad(premium.toString());
        return i2;
    }

    public abstract AbstractC7861e Signature();

    public abstract AbstractC7861e ad(AbstractC7861e abstractC7861e);

    public boolean admob() {
        return metrica() == 1;
    }

    public AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return applovin().ad(abstractC7861e.remoteconfig(abstractC7861e2));
    }

    public int amazon() {
        return (loadAd() + 7) / 8;
    }

    public abstract AbstractC7861e applovin();

    public abstract boolean appmetrica(AbstractC7904e abstractC7904e, Object obj, Object obj2);

    public boolean crashlytics() {
        return firebase().testBit(0);
    }

    public abstract BigInteger firebase();

    public abstract void inmobi(C5109e c5109e, Thread thread);

    public abstract AbstractC7861e isPro();

    public abstract void isVip(C5109e c5109e, C5109e c5109e2);

    public abstract boolean license(AbstractC7904e abstractC7904e, C16267e c16267e, C16267e c16267e2);

    public abstract int loadAd();

    public int metrica() {
        return firebase().bitLength();
    }

    public AbstractC7861e premium(int i) {
        AbstractC7861e abstractC7861e = this;
        for (int i2 = 0; i2 < i; i2++) {
            abstractC7861e = abstractC7861e.applovin();
        }
        return abstractC7861e;
    }

    public AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return remoteconfig(abstractC7861e).subs(abstractC7861e2.remoteconfig(abstractC7861e3));
    }

    public abstract boolean purchase(AbstractC7904e abstractC7904e, C5109e c5109e, C5109e c5109e2);

    public abstract AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e);

    public AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return remoteconfig(abstractC7861e).ad(abstractC7861e2.remoteconfig(abstractC7861e3));
    }

    public byte[] smaato() {
        return AbstractC5907e.ad(amazon(), firebase());
    }

    public abstract AbstractC7861e subs(AbstractC7861e abstractC7861e);

    public boolean subscription() {
        return firebase().signum() == 0;
    }

    public abstract AbstractC7861e tapsense();

    public String toString() {
        switch (this.f15913e) {
            case 3:
                return firebase().toString(16);
            default:
                return super.toString();
        }
    }

    public abstract AbstractC7861e vip();

    public abstract AbstractC7861e yandex(AbstractC7861e abstractC7861e);
}
