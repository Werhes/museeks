package defpackage;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f2463e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f2464e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f2465e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f2466e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2467e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f2468e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f2469e;

    public C0423e() {
        this.f2467e = 3;
        this.f2463e = new C17208e(1);
        this.f2469e = new int[2];
    }

    public C0423e(Bitmap bitmap) {
        this.f2467e = 2;
        ArrayList arrayList = new ArrayList();
        this.f2469e = arrayList;
        this.f2465e = 16;
        this.f2464e = 12544;
        this.f2466e = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f2468e = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C13906e.appmetrica);
        this.f2463e = bitmap;
        arrayList.add(C1188e.appmetrica);
        arrayList.add(C1188e.purchase);
        arrayList.add(C1188e.billing);
        arrayList.add(C1188e.yandex);
        arrayList.add(C1188e.startapp);
        arrayList.add(C1188e.adcel);
    }

    public C0423e(C0909e c0909e, int i, int i2, int i3, String str) {
        this.f2467e = 1;
        this.f2468e = c0909e;
        this.f2465e = i;
        this.f2464e = i2;
        this.f2466e = i3;
        this.f2463e = str;
    }

    public C0423e(C11446e c11446e) {
        this.f2467e = 0;
        this.f2465e = 1;
        this.f2463e = c11446e;
        this.f2469e = c11446e;
    }

    public C0423e(C17903e c17903e, Object[] objArr, StringBuilder sb) {
        this.f2467e = 5;
        this.f2465e = 0;
        this.f2464e = -1;
        AbstractC9835e.advert(c17903e, "context");
        this.f2463e = c17903e;
        this.f2466e = 0;
        this.f2469e = objArr;
        this.f2468e = sb;
    }

    public C0423e(int[] iArr) {
        this.f2467e = 4;
        this.f2463e = iArr;
        C16121e c16121e = new C16121e(-1, -1);
        this.f2469e = c16121e;
        this.f2468e = c16121e;
    }

    public static void advert(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(AbstractC9461e.ad(obj));
        sb.append("]");
    }

    public void ad(C1188e c1188e) {
        ArrayList arrayList = (ArrayList) this.f2469e;
        if (arrayList.contains(c1188e)) {
            return;
        }
        arrayList.add(c1188e);
    }

    public void adcel(C16121e c16121e, StringBuilder sb) {
        for (C16121e c16121e2 : c16121e.license.values()) {
            sb.append("  ");
            sb.append(c16121e);
            sb.append(" -> ");
            sb.append(c16121e2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.f2463e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, c16121e2.ad, Math.min(iArr.length, c16121e2.vip + 1))));
            sb.append("\"]\n");
            adcel(c16121e2, sb);
        }
    }

    public void appmetrica() {
        int[] iArr = (int[]) this.f2469e;
        int i = (this.f2466e + 1) % 4;
        this.f2466e = i;
        if (i == 0) {
            iArr[this.f2464e] = ((C17208e) this.f2463e).smaato();
            this.f2464e = (this.f2464e + 1) % iArr.length;
        }
    }

    public void billing() {
        if (this.f2464e == 0) {
            return;
        }
        HashMap hashMap = ((C16121e) this.f2468e).license;
        int[] iArr = (int[]) this.f2463e;
        C16121e c16121e = (C16121e) hashMap.get(Integer.valueOf(iArr[this.f2465e]));
        while (true) {
            int i = (c16121e.vip - c16121e.ad) + 1;
            int i2 = this.f2464e;
            if (i > i2) {
                return;
            }
            int i3 = this.f2465e + i;
            this.f2465e = i3;
            this.f2468e = c16121e;
            int i4 = i2 - i;
            this.f2464e = i4;
            if (i4 > 0) {
                c16121e = (C16121e) c16121e.license.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        int i2;
        appmetrica();
        int i3 = this.f2465e;
        int i4 = this.f2466e;
        int i5 = i4 * 8;
        int[] iArr = (int[]) this.f2469e;
        int i6 = this.f2464e;
        int i7 = iArr[i6];
        if (i5 != 0) {
            i7 = (i7 << i5) | (iArr[(i6 + 1) % iArr.length] >>> (32 - i5));
        }
        int i8 = i3 ^ i7;
        this.f2465e = i8;
        if (i4 != 0) {
            i2 = ((C17208e) this.f2463e).smaato();
        } else {
            int length = (i6 + 1) % iArr.length;
            this.f2464e = length;
            i2 = iArr[length];
        }
        int i9 = i8 ^ i2;
        this.f2465e = i9;
        C6130e.mopub(i9, 0, bArr);
        reset();
        return 4;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return 4;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        C17208e c17208e = (C17208e) this.f2463e;
        c17208e.init(true, interfaceC3894e);
        c17208e.getClass();
        this.f2468e = new C6130e(c17208e);
        license();
    }

    public void license() {
        int i = 0;
        this.f2465e = 0;
        while (true) {
            int[] iArr = (int[]) this.f2469e;
            if (i >= iArr.length - 1) {
                this.f2464e = iArr.length - 1;
                this.f2466e = 3;
                return;
            } else {
                iArr[i] = ((C17208e) this.f2463e).smaato();
                i++;
            }
        }
    }

    public VolumeProvider metrica() {
        C0423e c0423e;
        if (((VolumeProvider) this.f2469e) != null) {
            c0423e = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            c0423e = this;
            c0423e.f2469e = new C10753e(c0423e, this.f2465e, this.f2464e, this.f2466e, (String) this.f2463e, 1);
        } else {
            c0423e = this;
            c0423e.f2469e = new C9682e(c0423e, c0423e.f2465e, c0423e.f2464e, c0423e.f2466e, 1);
        }
        return (VolumeProvider) c0423e.f2469e;
    }

    public boolean mopub(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = (int[]) this.f2463e;
            int length = iArr.length;
            int min = Math.min(length, i2);
            if (min - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean purchase() {
        C4751e vip = ((C11446e) this.f2469e).vip.vip();
        int ad = vip.ad(6);
        return !(ad == 0 || ((ByteBuffer) vip.f8352e).get(ad + vip.f8353e) == 0) || this.f2464e == 65039;
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        switch (this.f2467e) {
            case 0:
                this.f2465e = 1;
                this.f2469e = (C11446e) this.f2463e;
                this.f2466e = 0;
                return;
            default:
                C6130e c6130e = (C6130e) this.f2468e;
                if (c6130e != null) {
                    ((C17208e) this.f2463e).vip(c6130e);
                }
                license();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r9 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r9 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startapp(java.lang.Object r9, defpackage.EnumC8410e r10, defpackage.C15794e r11) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0423e.startapp(java.lang.Object, eٌؐۥ, eٕۢؑ):void");
    }

    public String toString() {
        switch (this.f2467e) {
            case 4:
                StringBuilder sb = new StringBuilder("digraph {\n");
                adcel((C16121e) this.f2469e, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        appmetrica();
        int i = this.f2466e * 8;
        int i2 = 128;
        int i3 = 0;
        while (i2 > 0) {
            if ((b & i2) != 0) {
                int i4 = i + i3;
                int i5 = this.f2465e;
                int[] iArr = (int[]) this.f2469e;
                int i6 = this.f2464e;
                int i7 = iArr[i6];
                if (i4 != 0) {
                    i7 = (i7 << i4) | (iArr[(i6 + 1) % iArr.length] >>> (32 - i4));
                }
                this.f2465e = i5 ^ i7;
            }
            i2 >>= 1;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }

    public C13906e vip() {
        int max;
        int i;
        ArrayList arrayList = (ArrayList) this.f2468e;
        Bitmap bitmap = (Bitmap) this.f2463e;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i2 = this.f2466e;
        int i3 = this.f2464e;
        double d = -1.0d;
        if (i3 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i3) {
                d = Math.sqrt(i3 / height);
            }
        } else if (i2 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i2) {
            d = i2 / max;
        }
        int i4 = 0;
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        C18464e c18464e = new C18464e(iArr, this.f2465e, arrayList.isEmpty() ? null : (C18256e[]) arrayList.toArray(new C18256e[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) c18464e.f36192e;
        ArrayList arrayList3 = (ArrayList) this.f2469e;
        C13906e c13906e = new C13906e(arrayList3, arrayList2);
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = c13906e.metrica;
            if (i5 >= size) {
                sparseBooleanArray.clear();
                return c13906e;
            }
            C1188e c1188e = (C1188e) arrayList3.get(i5);
            float[] fArr = c1188e.metrica;
            float[] fArr2 = c1188e.ad;
            int length = fArr.length;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i6 = i4; i6 < length; i6++) {
                float f3 = fArr[i6];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = fArr.length;
                for (int i7 = i4; i7 < length2; i7++) {
                    float f4 = fArr[i7];
                    if (f4 > 0.0f) {
                        fArr[i7] = f4 / f2;
                    }
                }
            }
            List list = c13906e.ad;
            int size2 = list.size();
            int i8 = i4;
            float f5 = 0.0f;
            C18075e c18075e = null;
            while (i8 < size2) {
                C18075e c18075e2 = (C18075e) list.get(i8);
                float[] vip = c18075e2.vip();
                float f6 = vip[1];
                float f7 = f;
                float[] fArr3 = c1188e.vip;
                if (f6 >= fArr2[i8] && f6 <= fArr2[2]) {
                    float f8 = vip[2];
                    if (f8 >= fArr3[i8] && f8 <= fArr3[2] && !sparseBooleanArray.get(c18075e2.license)) {
                        float[] vip2 = c18075e2.vip();
                        C18075e c18075e3 = c13906e.license;
                        int i9 = c18075e3 != null ? c18075e3.appmetrica : 1;
                        i = size;
                        float[] fArr4 = c1188e.metrica;
                        float f9 = fArr4[i8];
                        float abs = f9 > f7 ? (1.0f - Math.abs(vip2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float abs2 = f10 > f7 ? (1.0f - Math.abs(vip2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = abs + abs2 + (f11 > f7 ? (c18075e2.appmetrica / i9) * f11 : f7);
                        if (c18075e == null || f12 > f5) {
                            c18075e = c18075e2;
                            f5 = f12;
                        }
                        i8++;
                        size = i;
                        f = f7;
                    }
                }
                i = size;
                i8++;
                size = i;
                f = f7;
            }
            int i10 = size;
            if (c18075e != null && c1188e.license) {
                sparseBooleanArray.append(c18075e.license, true);
            }
            c13906e.vip.put(c1188e, c18075e);
            i5++;
            i4 = i8;
            size = i10;
        }
    }

    public void yandex() {
        C16121e c16121e = ((C16121e) this.f2468e).metrica;
        if (c16121e != null) {
            this.f2468e = c16121e;
        } else {
            this.f2468e = (C16121e) this.f2469e;
            int i = this.f2464e;
            if (i > 0) {
                this.f2464e = i - 1;
            }
            if (this.f2466e > 0) {
                this.f2465e++;
            }
        }
        billing();
    }
}
