package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7244e implements Iterable, Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10553e f14800e = new C10553e(AbstractC17904e.ad);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f14801e;

    static {
        int i = AbstractC3433e.ad;
    }

    public static C10553e Signature(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return f14800e;
        }
        subscription(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C10553e(bArr2);
    }

    public static C10553e loadAd(int i, int i2, byte[] bArr) {
        try {
            return Signature(i, i2, bArr);
        } catch (C10895e e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* synthetic */ boolean remoteconfig(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        subscription(i, i4, bArr.length);
        subscription(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static int subscription(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public abstract void adcel(AbstractC13874e abstractC13874e);

    public final byte[] admob() {
        int billing = billing();
        if (billing == 0) {
            return AbstractC17904e.ad;
        }
        byte[] bArr = new byte[billing];
        startapp(billing, bArr);
        return bArr;
    }

    public abstract boolean advert(AbstractC7244e abstractC7244e);

    public abstract byte appmetrica(int i);

    public abstract int billing();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7244e)) {
            return false;
        }
        AbstractC7244e abstractC7244e = (AbstractC7244e) obj;
        int billing = billing();
        if (billing != abstractC7244e.billing()) {
            return false;
        }
        if (billing == 0) {
            return true;
        }
        int i = this.f14801e;
        int i2 = abstractC7244e.f14801e;
        if (i == 0 || i2 == 0 || i == i2) {
            return advert(abstractC7244e);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14801e;
        if (i == 0) {
            int billing = billing();
            i = smaato(billing, billing);
            if (i == 0) {
                i = 1;
            }
            this.f14801e = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1952e(this);
    }

    public abstract int smaato(int i, int i2);

    public abstract void startapp(int i, byte[] bArr);

    public final String toString() {
        Locale locale = Locale.ROOT;
        return AbstractC1786e.signatures(AbstractC10257e.smaato("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", billing(), " contents=\""), billing() <= 50 ? AbstractC18467e.appmetrica(admob()) : AbstractC18467e.appmetrica(yandex(0, 47).admob()).concat("..."), "\">");
    }

    public abstract AbstractC11321e yandex(int i, int i2);
}
