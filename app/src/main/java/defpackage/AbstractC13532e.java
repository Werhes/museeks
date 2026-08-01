package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13532e implements Iterable, Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2655e f26826e = new C2655e(AbstractC12312e.vip);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f26827e = 0;

    static {
        int i = AbstractC1605e.ad;
    }

    public static C2655e ads(int i, int i2, byte[] bArr) {
        isVip(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2655e(bArr2);
    }

    public static int isVip(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC1634e.smaato("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i2, i3, "End index: ", " >= "));
    }

    public static AbstractC13532e premium(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            C2655e ads = i2 == 0 ? null : ads(0, i2, bArr);
            if (ads == null) {
                break;
            }
            arrayList.add(ads);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f26826e : yandex(arrayList.iterator(), size);
    }

    public static void subs(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC1786e.admob(i, "Index < 0: "));
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, eؑؓؐ] */
    public static AbstractC13532e yandex(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("length (", i, ") must be >= 1"));
        }
        if (i == 1) {
            return (AbstractC13532e) it.next();
        }
        int i2 = i >>> 1;
        AbstractC13532e yandex = yandex(it, i2);
        AbstractC13532e yandex2 = yandex(it, i - i2);
        if (Alert.DURATION_SHOW_INDEFINITELY - yandex.startapp() < yandex2.startapp()) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(yandex.startapp(), yandex2.startapp(), "ByteString would be too long: ", "+"));
        }
        if (yandex2.startapp() == 0) {
            return yandex;
        }
        if (yandex.startapp() == 0) {
            return yandex2;
        }
        int startapp = yandex2.startapp() + yandex.startapp();
        if (startapp < 128) {
            int startapp2 = yandex.startapp();
            int startapp3 = yandex2.startapp();
            int i3 = startapp2 + startapp3;
            byte[] bArr = new byte[i3];
            isVip(0, startapp2, yandex.startapp());
            isVip(0, startapp2, i3);
            if (startapp2 > 0) {
                yandex.adcel(0, 0, startapp2, bArr);
            }
            isVip(0, startapp3, yandex2.startapp());
            isVip(startapp2, i3, i3);
            if (startapp3 > 0) {
                yandex2.adcel(0, startapp2, startapp3, bArr);
            }
            return new C2655e(bArr);
        }
        if (yandex instanceof C3431e) {
            C3431e c3431e = (C3431e) yandex;
            AbstractC13532e abstractC13532e = c3431e.f7686e;
            AbstractC13532e abstractC13532e2 = c3431e.f7684e;
            if (yandex2.startapp() + abstractC13532e2.startapp() < 128) {
                int startapp4 = abstractC13532e2.startapp();
                int startapp5 = yandex2.startapp();
                int i4 = startapp4 + startapp5;
                byte[] bArr2 = new byte[i4];
                isVip(0, startapp4, abstractC13532e2.startapp());
                isVip(0, startapp4, i4);
                if (startapp4 > 0) {
                    abstractC13532e2.adcel(0, 0, startapp4, bArr2);
                }
                isVip(0, startapp5, yandex2.startapp());
                isVip(startapp4, i4, i4);
                if (startapp5 > 0) {
                    yandex2.adcel(0, startapp4, startapp5, bArr2);
                }
                return new C3431e(abstractC13532e, new C2655e(bArr2));
            }
            if (abstractC13532e.advert() > abstractC13532e2.advert() && c3431e.f7687e > yandex2.advert()) {
                return new C3431e(abstractC13532e, new C3431e(abstractC13532e2, yandex2));
            }
        }
        if (startapp >= C3431e.crashlytics(Math.max(yandex.advert(), yandex2.advert()) + 1)) {
            return new C3431e(yandex, yandex2);
        }
        ?? obj = new Object();
        obj.f1185e = new ArrayDeque();
        obj.ad(yandex);
        obj.ad(yandex2);
        ArrayDeque arrayDeque = (ArrayDeque) obj.f1185e;
        AbstractC13532e abstractC13532e3 = (AbstractC13532e) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            abstractC13532e3 = new C3431e((AbstractC13532e) arrayDeque.pop(), abstractC13532e3);
        }
        return abstractC13532e3;
    }

    public abstract int Signature(int i, int i2, int i3);

    public abstract void adcel(int i, int i2, int i3, byte[] bArr);

    public abstract AbstractC13532e admob(int i, int i2);

    public abstract int advert();

    public abstract byte appmetrica(int i);

    public abstract byte billing(int i);

    public final int hashCode() {
        int i = this.f26827e;
        if (i == 0) {
            int startapp = startapp();
            i = loadAd(startapp, 0, startapp);
            if (i == 0) {
                i = 1;
            }
            this.f26827e = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    /* renamed from: inmobi, reason: merged with bridge method [inline-methods] */
    public AbstractC7014e iterator() {
        return new C15891e(this);
    }

    public abstract int loadAd(int i, int i2, int i3);

    public abstract void remoteconfig(C5633e c5633e);

    public abstract boolean smaato();

    public abstract int startapp();

    public abstract String subscription(Charset charset);

    public abstract boolean tapsense();

    public final String toString() {
        Locale locale = Locale.ROOT;
        return AbstractC1786e.signatures(AbstractC10257e.smaato("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", startapp(), " contents=\""), startapp() <= 50 ? AbstractC18039e.yandex(this) : AbstractC18039e.yandex(admob(0, 47)).concat("..."), "\">");
    }
}
