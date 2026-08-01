package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.conscrypt.PSKKeyManager;

/* renamed from: e٘ۙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17980e implements InterfaceC0554e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final Hashtable f35262e = new Hashtable();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f35263e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long[] f35264e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f35265e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C10379e f35266e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long[] f35267e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final byte[] f35268e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6213e f35269e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C17041e[] f35270e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C17041e[] f35271e;

    static {
        purchase(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        purchase(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        purchase(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        purchase(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        purchase(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        purchase(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        purchase(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        purchase(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        purchase(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public C17980e(int i, int i2) {
        this.f35268e = new byte[1];
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i2, "Output size must be a multiple of 8 bits. :"));
        }
        this.f35265e = i2 / 8;
        C6213e c6213e = new C6213e(i);
        this.f35269e = c6213e;
        this.f35266e = new C10379e(this, c6213e.f12984e);
    }

    public C17980e(C17980e c17980e) {
        this(c17980e.f35269e.f12984e * 8, c17980e.f35265e * 8);
        metrica(c17980e);
    }

    public static void billing(C17041e[] c17041eArr) {
        if (c17041eArr == null) {
            return;
        }
        for (int i = 1; i < c17041eArr.length; i++) {
            C17041e c17041e = c17041eArr[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = c17041e.vip;
                int i4 = i2 - 1;
                C17041e c17041e2 = c17041eArr[i4];
                if (i3 < c17041e2.vip) {
                    c17041eArr[i2] = c17041e2;
                    i2 = i4;
                }
            }
            c17041eArr[i2] = c17041e;
        }
    }

    public static void purchase(int i, int i2, long[] jArr) {
        f35262e.put(Integer.valueOf((i / 8) | ((i2 / 8) << 16)), jArr);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C17980e(this);
    }

    public final void appmetrica(C14169e c14169e) {
        this.f35264e = null;
        this.f35263e = null;
        this.f35271e = null;
        this.f35270e = null;
        int i = 0;
        if (c14169e != null) {
            Hashtable hashtable = c14169e.f28019e;
            if (((byte[]) hashtable.get(0)).length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            Enumeration keys = hashtable.keys();
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                byte[] bArr = (byte[]) hashtable.get(num);
                if (num.intValue() == 0) {
                    this.f35263e = bArr;
                } else if (num.intValue() < 48) {
                    vector.addElement(new C17041e(num.intValue(), bArr));
                } else {
                    vector2.addElement(new C17041e(num.intValue(), bArr));
                }
            }
            C17041e[] c17041eArr = new C17041e[vector.size()];
            this.f35271e = c17041eArr;
            vector.copyInto(c17041eArr);
            billing(this.f35271e);
            C17041e[] c17041eArr2 = new C17041e[vector2.size()];
            this.f35270e = c17041eArr2;
            vector2.copyInto(c17041eArr2);
            billing(this.f35270e);
        }
        C6213e c6213e = this.f35269e;
        long[] jArr = (long[]) f35262e.get(Integer.valueOf(c6213e.f12984e | (this.f35265e << 16)));
        byte[] bArr2 = this.f35263e;
        if (bArr2 != null || jArr == null) {
            this.f35264e = new long[c6213e.f12984e / 8];
            if (bArr2 != null) {
                yandex(0, bArr2);
            }
            byte[] bArr3 = new byte[32];
            bArr3[0] = 83;
            bArr3[1] = 72;
            bArr3[2] = 65;
            bArr3[3] = 51;
            bArr3[4] = 1;
            bArr3[5] = 0;
            AbstractC3628e.subscription(8, r3 * 8, bArr3);
            yandex(4, bArr3);
        } else {
            this.f35264e = AbstractC12442e.purchase(jArr);
        }
        if (this.f35271e != null) {
            while (true) {
                C17041e[] c17041eArr3 = this.f35271e;
                if (i >= c17041eArr3.length) {
                    break;
                }
                C17041e c17041e = c17041eArr3[i];
                yandex(c17041e.vip, c17041e.ad);
                i++;
            }
        }
        this.f35267e = AbstractC12442e.purchase(this.f35264e);
        startapp(48);
    }

    public final int license(byte[] bArr, int i) {
        C10379e c10379e;
        int i2;
        byte[] bArr2;
        int i3;
        C10379e c10379e2 = this.f35266e;
        if (c10379e2 == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        int length = bArr.length;
        int i4 = this.f35265e;
        if (length < i + i4) {
            throw new RuntimeException("Output buffer is too short to hold output");
        }
        c10379e2.isPro(this.f35264e);
        int i5 = 0;
        if (this.f35270e != null) {
            int i6 = 0;
            while (true) {
                C17041e[] c17041eArr = this.f35270e;
                if (i6 >= c17041eArr.length) {
                    break;
                }
                C17041e c17041e = c17041eArr[i6];
                yandex(c17041e.vip, c17041e.ad);
                i6++;
            }
        }
        int i7 = this.f35269e.f12984e;
        int i8 = ((i4 + i7) - 1) / i7;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i9 * i7;
            int min = Math.min(i7, i4 - i10);
            int i11 = i + i10;
            int i12 = 8;
            byte[] bArr3 = new byte[8];
            AbstractC3628e.subscription(i5, i9, bArr3);
            long[] jArr = new long[this.f35264e.length];
            startapp(63);
            c10379e2.m2801break(bArr3, i5, 8, jArr);
            c10379e2.isPro(jArr);
            int i13 = (min + 7) / 8;
            int i14 = i5;
            while (i14 < i13) {
                int i15 = i14 * 8;
                int min2 = Math.min(i12, min - i15);
                byte[] bArr4 = bArr3;
                if (min2 == i12) {
                    AbstractC3628e.subscription(i15 + i11, jArr[i14], bArr);
                    c10379e = c10379e2;
                    i2 = i7;
                    bArr2 = bArr4;
                    i3 = 0;
                } else {
                    c10379e = c10379e2;
                    i2 = i7;
                    bArr2 = bArr4;
                    i3 = 0;
                    AbstractC3628e.subscription(0, jArr[i14], bArr2);
                    System.arraycopy(bArr2, 0, bArr, i15 + i11, min2);
                }
                i14++;
                bArr3 = bArr2;
                i5 = i3;
                i7 = i2;
                c10379e2 = c10379e;
                i12 = 8;
            }
            i9++;
            i7 = i7;
        }
        int i16 = i5;
        long[] jArr2 = this.f35267e;
        long[] jArr3 = this.f35264e;
        System.arraycopy(jArr2, i16, jArr3, i16, jArr3.length);
        startapp(48);
        return i4;
    }

    public final void metrica(C17980e c17980e) {
        C10379e c10379e = c17980e.f35266e;
        C10379e c10379e2 = this.f35266e;
        c10379e2.getClass();
        byte[] bArr = (byte[]) c10379e.f20510e;
        byte[] bArr2 = (byte[]) c10379e2.f20510e;
        C17041e[] c17041eArr = null;
        if (bArr == null) {
            bArr2 = null;
        } else if (bArr2 == null || bArr2.length != bArr.length) {
            bArr2 = AbstractC12442e.license(bArr);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }
        c10379e2.f20510e = bArr2;
        c10379e2.f20509e = c10379e.f20509e;
        c10379e2.f20507e = AbstractC12442e.billing((long[]) c10379e.f20507e, (long[]) c10379e2.f20507e);
        C16722e c16722e = (C16722e) c10379e2.f20508e;
        C16722e c16722e2 = (C16722e) c10379e.f20508e;
        c16722e.getClass();
        c16722e.f32780e = AbstractC12442e.billing((long[]) c16722e2.f32780e, (long[]) c16722e.f32780e);
        c16722e.f32781e = c16722e2.f32781e;
        this.f35264e = AbstractC12442e.billing(c17980e.f35264e, this.f35264e);
        this.f35267e = AbstractC12442e.billing(c17980e.f35267e, this.f35267e);
        byte[] bArr3 = c17980e.f35263e;
        byte[] bArr4 = this.f35263e;
        if (bArr3 == null) {
            bArr4 = null;
        } else if (bArr4 == null || bArr4.length != bArr3.length) {
            bArr4 = AbstractC12442e.license(bArr3);
        } else {
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
        }
        this.f35263e = bArr4;
        C17041e[] c17041eArr2 = c17980e.f35271e;
        C17041e[] c17041eArr3 = this.f35271e;
        if (c17041eArr2 == null) {
            c17041eArr3 = null;
        } else {
            if (c17041eArr3 == null || c17041eArr3.length != c17041eArr2.length) {
                c17041eArr3 = new C17041e[c17041eArr2.length];
            }
            System.arraycopy(c17041eArr2, 0, c17041eArr3, 0, c17041eArr3.length);
        }
        this.f35271e = c17041eArr3;
        C17041e[] c17041eArr4 = c17980e.f35270e;
        C17041e[] c17041eArr5 = this.f35270e;
        if (c17041eArr4 != null) {
            if (c17041eArr5 == null || c17041eArr5.length != c17041eArr4.length) {
                c17041eArr5 = new C17041e[c17041eArr4.length];
            }
            c17041eArr = c17041eArr5;
            System.arraycopy(c17041eArr4, 0, c17041eArr, 0, c17041eArr.length);
        }
        this.f35270e = c17041eArr;
    }

    public final void startapp(int i) {
        C10379e c10379e = this.f35266e;
        C16722e c16722e = (C16722e) c10379e.f20508e;
        long[] jArr = (long[]) c16722e.f32780e;
        jArr[0] = 0;
        jArr[1] = 0;
        c16722e.f32781e = false;
        jArr[1] = 4611686018427387904L;
        jArr[1] = (4611686018427387904L & (-274877906944L)) | ((i & 63) << 56);
        c10379e.f20509e = 0;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C17980e c17980e = (C17980e) interfaceC0554e;
        if (this.f35269e.f12984e != c17980e.f35269e.f12984e || this.f35265e != c17980e.f35265e) {
            throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        metrica(c17980e);
    }

    public final void yandex(int i, byte[] bArr) {
        startapp(i);
        int length = bArr.length;
        long[] jArr = this.f35264e;
        C10379e c10379e = this.f35266e;
        c10379e.m2801break(bArr, 0, length, jArr);
        c10379e.isPro(this.f35264e);
    }
}
