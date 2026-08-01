package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10115e {
    public static final int[] ad = new int[0];
    public static final long[] vip = new long[0];
    public static final Object[] metrica = new Object[0];

    public static Object ad(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static byte[] appmetrica(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final C14156e billing(C17149e c17149e, C13770e c13770e) {
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        float f = c17149e.adcel;
        boolean appmetrica = c13770e.appmetrica((Float.floatToRawIntBits(interfaceC14388e.vip()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object m3681throw = c13770e.m3681throw();
        if (appmetrica || m3681throw == C2987e.ad) {
            C10319e c10319e = new C10319e();
            purchase(c10319e, c17149e.purchase);
            Unit unit = Unit.INSTANCE;
            float f2 = c17149e.vip;
            float f3 = c17149e.metrica;
            long floatToRawIntBits = (Float.floatToRawIntBits(interfaceC14388e.mo497instanceof(f2)) << 32) | (Float.floatToRawIntBits(interfaceC14388e.mo497instanceof(f3)) & 4294967295L);
            float f4 = c17149e.license;
            float f5 = c17149e.appmetrica;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            C14156e c14156e = new C14156e(c10319e);
            String str = c17149e.ad;
            long j = c17149e.billing;
            C2815e c2815e = j != 16 ? new C2815e(j, c17149e.yandex) : null;
            boolean z = c17149e.startapp;
            c14156e.f27990e.setValue(new C2108e(floatToRawIntBits));
            c14156e.f27989e.setValue(Boolean.valueOf(z));
            C11105e c11105e = c14156e.f27986e;
            c11105e.billing.setValue(c2815e);
            c11105e.startapp.setValue(new C2108e(floatToRawIntBits2));
            c11105e.metrica = str;
            c13770e.m3682throws(c14156e);
            m3681throw = c14156e;
        }
        return (C14156e) m3681throw;
    }

    public static final int license(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final int metrica(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void purchase(C10319e c10319e, C15515e c15515e) {
        List list = c15515e.f30650e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC4517e abstractC4517e = (AbstractC4517e) list.get(i);
            if (abstractC4517e instanceof C6693e) {
                C16246e c16246e = new C16246e();
                C6693e c6693e = (C6693e) abstractC4517e;
                c16246e.license = c6693e.f13811e;
                c16246e.amazon = true;
                c16246e.metrica();
                c16246e.remoteconfig.adcel(c6693e.f13808e);
                c16246e.metrica();
                c16246e.metrica();
                c16246e.vip = c6693e.f13814e;
                c16246e.metrica();
                c16246e.metrica = c6693e.f13805e;
                c16246e.metrica();
                c16246e.billing = c6693e.f13818e;
                c16246e.metrica();
                c16246e.appmetrica = c6693e.f13817e;
                c16246e.metrica();
                c16246e.purchase = c6693e.f13812e;
                c16246e.loadAd = true;
                c16246e.metrica();
                c16246e.yandex = c6693e.f13815e;
                c16246e.loadAd = true;
                c16246e.metrica();
                c16246e.startapp = c6693e.f13809e;
                c16246e.loadAd = true;
                c16246e.metrica();
                c16246e.adcel = c6693e.f13813e;
                c16246e.loadAd = true;
                c16246e.metrica();
                c16246e.mopub = c6693e.f13807e;
                c16246e.Signature = true;
                c16246e.metrica();
                c16246e.advert = c6693e.f13806e;
                c16246e.Signature = true;
                c16246e.metrica();
                c16246e.smaato = c6693e.f13810e;
                c16246e.Signature = true;
                c16246e.metrica();
                c10319e.appmetrica(i, c16246e);
            } else if (abstractC4517e instanceof C15515e) {
                C10319e c10319e2 = new C10319e();
                C15515e c15515e2 = (C15515e) abstractC4517e;
                c10319e2.mopub = c15515e2.f30655e;
                c10319e2.metrica();
                c10319e2.advert = c15515e2.f30651e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.loadAd = c15515e2.f30648e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.Signature = c15515e2.f30657e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.admob = c15515e2.f30656e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.subscription = c15515e2.f30652e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.smaato = c15515e2.f30649e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.amazon = c15515e2.f30653e;
                c10319e2.remoteconfig = true;
                c10319e2.metrica();
                c10319e2.purchase = c15515e2.f30654e;
                c10319e2.billing = true;
                c10319e2.metrica();
                purchase(c10319e2, c15515e2);
                c10319e.appmetrica(i, c10319e2);
            }
        }
    }

    public static void startapp(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void vip(C0765e c0765e, Context context, boolean z, CharSequence charSequence, long j) {
        if (C12347e.license(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) AbstractC5546e.ad.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        c0765e.ad();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            c0765e.ad.ad(new C16118e(new C15978e(i), resolveInfo.loadLabel(packageManager).toString(), 0, new C6819e(context, resolveInfo, z, charSequence, j)));
        }
        c0765e.ad();
    }

    public static byte[] yandex(C2527e c2527e) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = c2527e.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return appmetrica(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
        }
        if (c2527e.read() == -1) {
            return appmetrica(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
