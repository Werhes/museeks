package defpackage;

import android.R;
import androidx.car.app.model.Action;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2206e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static C10017e f5610e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final short[] f5605e = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final int[] f5602e = {8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final byte[] f5608e = {56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, 19, 11, 3};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final byte[] f5599e = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28};

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f5612e = {13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31};

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int[] f5611e = {R.attr.transitionName, 0, 65536, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, Action.TYPE_PAN, 16777220, 16777220, Action.TYPE_PAN, 0, 1028, 66564, 16777216, 65536, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, Action.TYPE_PAN, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, Action.TYPE_PAN, 66560, 0, R.attr.manageSpaceActivity};

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int[] f5606e = {-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, RecyclerView.UNDEFINED_DURATION, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, RecyclerView.UNDEFINED_DURATION, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, RecyclerView.UNDEFINED_DURATION, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, RecyclerView.UNDEFINED_DURATION, -2146435040, -2146402272, 1081344};

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int[] f5609e = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 131080, 134349320, 134218240, 134217736, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final int[] f5603e = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final int[] f5607e = {PSKKeyManager.MAX_KEY_LENGTH_BYTES, 34078976, 34078720, 1107296512, 524288, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final int[] f5601e = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312};

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final int[] f5600e = {2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final int[] f5604e = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    public static void ad(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e) {
        return AbstractC1147e.ad(interfaceC12864e, true, new C4526e(29));
    }

    public static synchronized void billing(C10017e c10017e) {
        synchronized (AbstractC2206e.class) {
            if (f5610e != null) {
                throw new IllegalStateException("init() already called");
            }
            f5610e = c10017e;
        }
    }

    public static Object purchase(InterfaceC1618e interfaceC1618e, Function1 function1, AbstractC10731e abstractC10731e) {
        C12402e appmetrica = interfaceC1618e.appmetrica();
        appmetrica.metrica();
        C0378e subs = appmetrica.subs(1);
        byte[] bArr = subs.ad;
        int i = subs.metrica;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
        function1.invoke(wrap);
        int position = wrap.position() - i;
        if (position == 1) {
            subs.metrica += position;
            appmetrica.f24832e += position;
        } else {
            if (position < 0 || position > subs.ad()) {
                StringBuilder premium = AbstractC4653e.premium("Invalid number of bytes written: ", position, ". Should be in 0..");
                premium.append(subs.ad());
                throw new IllegalStateException(premium.toString().toString());
            }
            if (position != 0) {
                subs.metrica += position;
                appmetrica.f24832e += position;
            } else if (AbstractC10432e.license(subs)) {
                appmetrica.Signature();
            }
        }
        Object metrica = interfaceC1618e.metrica(abstractC10731e);
        return metrica == EnumC2821e.f6782e ? metrica : Unit.INSTANCE;
    }

    public static C5311e vip(C2553e c2553e) {
        return c2553e.f6412e.size() == 0 ? C5311e.vip : new C5311e(c2553e.f6412e);
    }

    public int[] license(boolean z, byte[] bArr) {
        byte[] bArr2;
        int i;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 56) {
                break;
            }
            byte b = f5608e[i2];
            if ((f5605e[b & 7] & bArr[b >>> 3]) == 0) {
                z2 = false;
            }
            zArr[i2] = z2;
            i2++;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = z ? i3 << 1 : (15 - i3) << 1;
            int i5 = i4 + 1;
            iArr[i5] = 0;
            iArr[i4] = 0;
            int i6 = 0;
            while (true) {
                bArr2 = f5599e;
                if (i6 >= 28) {
                    break;
                }
                int i7 = bArr2[i3] + i6;
                if (i7 < 28) {
                    zArr2[i6] = zArr[i7];
                } else {
                    zArr2[i6] = zArr[i7 - 28];
                }
                i6++;
            }
            for (i = 28; i < 56; i++) {
                int i8 = bArr2[i3] + i;
                if (i8 < 56) {
                    zArr2[i] = zArr[i8];
                } else {
                    zArr2[i] = zArr[i8 - 28];
                }
            }
            for (int i9 = 0; i9 < 24; i9++) {
                byte[] bArr3 = f5612e;
                boolean z3 = zArr2[bArr3[i9]];
                int[] iArr2 = f5602e;
                if (z3) {
                    iArr[i4] = iArr[i4] | iArr2[i9];
                }
                if (zArr2[bArr3[i9 + 24]]) {
                    iArr[i5] = iArr[i5] | iArr2[i9];
                }
            }
        }
        for (int i10 = 0; i10 != 32; i10 += 2) {
            int i11 = iArr[i10];
            int i12 = i10 + 1;
            int i13 = iArr[i12];
            iArr[i10] = ((16515072 & i13) >>> 10) | ((i11 & 16515072) << 6) | ((i11 & 4032) << 10) | ((i13 & 4032) >>> 6);
            iArr[i12] = ((i11 & 63) << 16) | ((i11 & 258048) << 12) | ((258048 & i13) >>> 4) | (i13 & 63);
        }
        return iArr;
    }

    public void metrica(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int metrica = AbstractC3628e.metrica(i, bArr);
        int metrica2 = AbstractC3628e.metrica(i + 4, bArr);
        int i3 = ((metrica >>> 4) ^ metrica2) & 252645135;
        int i4 = metrica2 ^ i3;
        int i5 = (i3 << 4) ^ metrica;
        int i6 = ((i5 >>> 16) ^ i4) & 65535;
        int i7 = i4 ^ i6;
        int i8 = i5 ^ (i6 << 16);
        int i9 = ((i7 >>> 2) ^ i8) & 858993459;
        int i10 = i8 ^ i9;
        int i11 = i7 ^ (i9 << 2);
        int i12 = ((i11 >>> 8) ^ i10) & 16711935;
        int i13 = i10 ^ i12;
        int i14 = i11 ^ (i12 << 8);
        int i15 = (i14 >>> 31) | (i14 << 1);
        int i16 = (i13 ^ i15) & (-1431655766);
        int i17 = i13 ^ i16;
        int i18 = i15 ^ i16;
        int i19 = (i17 >>> 31) | (i17 << 1);
        for (int i20 = 0; i20 < 8; i20++) {
            int i21 = i20 * 4;
            int i22 = ((i18 << 28) | (i18 >>> 4)) ^ iArr[i21];
            int[] iArr2 = f5600e;
            int i23 = iArr2[i22 & 63];
            int[] iArr3 = f5607e;
            int i24 = i23 | iArr3[(i22 >>> 8) & 63];
            int[] iArr4 = f5609e;
            int i25 = i24 | iArr4[(i22 >>> 16) & 63];
            int[] iArr5 = f5611e;
            int i26 = iArr5[(i22 >>> 24) & 63] | i25;
            int i27 = iArr[i21 + 1] ^ i18;
            int[] iArr6 = f5604e;
            int i28 = i26 | iArr6[i27 & 63];
            int[] iArr7 = f5601e;
            int i29 = i28 | iArr7[(i27 >>> 8) & 63];
            int[] iArr8 = f5603e;
            int i30 = i29 | iArr8[(i27 >>> 16) & 63];
            int[] iArr9 = f5606e;
            i19 ^= i30 | iArr9[(i27 >>> 24) & 63];
            int i31 = ((i19 << 28) | (i19 >>> 4)) ^ iArr[i21 + 2];
            int i32 = iArr5[(i31 >>> 24) & 63] | iArr2[i31 & 63] | iArr3[(i31 >>> 8) & 63] | iArr4[(i31 >>> 16) & 63];
            int i33 = iArr[i21 + 3] ^ i19;
            i18 ^= (((i32 | iArr6[i33 & 63]) | iArr7[(i33 >>> 8) & 63]) | iArr8[(i33 >>> 16) & 63]) | iArr9[(i33 >>> 24) & 63];
        }
        int i34 = (i18 >>> 1) | (i18 << 31);
        int i35 = (i19 ^ i34) & (-1431655766);
        int i36 = i19 ^ i35;
        int i37 = i34 ^ i35;
        int i38 = (i36 >>> 1) | (i36 << 31);
        int i39 = ((i38 >>> 8) ^ i37) & 16711935;
        int i40 = i37 ^ i39;
        int i41 = i38 ^ (i39 << 8);
        int i42 = ((i41 >>> 2) ^ i40) & 858993459;
        int i43 = i40 ^ i42;
        int i44 = i41 ^ (i42 << 2);
        int i45 = ((i43 >>> 16) ^ i44) & 65535;
        int i46 = i44 ^ i45;
        int i47 = i43 ^ (i45 << 16);
        int i48 = ((i47 >>> 4) ^ i46) & 252645135;
        AbstractC3628e.billing(i47 ^ (i48 << 4), i2, bArr2);
        AbstractC3628e.billing(i46 ^ i48, i2 + 4, bArr2);
    }
}
