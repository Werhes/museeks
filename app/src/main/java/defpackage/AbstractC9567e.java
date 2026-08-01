package defpackage;

/* renamed from: eٍٚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9567e implements InterfaceC1196e, InterfaceC0554e {

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final long[] f18985e = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f18986e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public long f18987e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public long f18988e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f18989e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f18990e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final long[] f18991e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f18992e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f18993e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f18994e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f18995e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f18996e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f18997e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC0300e f18998e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f18999e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f19000e;

    public AbstractC9567e(EnumC0300e enumC0300e) {
        this.f18992e = new byte[8];
        this.f18991e = new long[80];
        this.f18998e = enumC0300e;
        this.f18989e = 0;
        reset();
    }

    public AbstractC9567e(AbstractC9567e abstractC9567e) {
        this.f18992e = new byte[8];
        this.f18991e = new long[80];
        this.f18998e = abstractC9567e.f18998e;
        yandex(abstractC9567e);
    }

    public static long appmetrica(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public static long billing(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    public static long license(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    public static long purchase(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public final void adcel() {
        long[] jArr;
        long j = this.f18996e;
        if (j > 2305843009213693951L) {
            this.f18986e += j >>> 61;
            this.f18996e = j & 2305843009213693951L;
        }
        int i = 16;
        while (true) {
            jArr = this.f18991e;
            if (i > 79) {
                break;
            }
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((((j4 >>> 8) | (j4 << 56)) ^ ((j4 << 63) | (j4 >>> 1))) ^ (j4 >>> 7)) + jArr[i - 16];
            i++;
        }
        long j5 = this.f19000e;
        long j6 = this.f18999e;
        long j7 = this.f18994e;
        long j8 = this.f18997e;
        long j9 = this.f18990e;
        long j10 = this.f18995e;
        long j11 = this.f18988e;
        long j12 = j5;
        long j13 = j8;
        long j14 = j6;
        long j15 = j9;
        long j16 = j7;
        long j17 = j10;
        long j18 = this.f18987e;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            long billing = billing(j15);
            long license = license(j15, j17, j11);
            long j19 = j15;
            long j20 = j11;
            long j21 = j17;
            long[] jArr2 = f18985e;
            int i4 = i3 + 1;
            long j22 = billing + license + jArr2[i3] + jArr[i3] + j18;
            long j23 = j13 + j22;
            long j24 = j14;
            long j25 = j16;
            long purchase = purchase(j12) + appmetrica(j12, j24, j25) + j22;
            long billing2 = billing(j23) + license(j23, j19, j21) + jArr2[i4];
            int i5 = i3 + 2;
            long j26 = billing2 + jArr[i4] + j20;
            long j27 = j25 + j26;
            long j28 = j12;
            long purchase2 = purchase(purchase) + appmetrica(purchase, j28, j24) + j26;
            int i6 = i3 + 3;
            long billing3 = billing(j27) + license(j27, j23, j19) + jArr2[i5] + jArr[i5] + j21;
            long j29 = j24 + billing3;
            long purchase3 = purchase(purchase2) + appmetrica(purchase2, purchase, j28) + billing3;
            int i7 = i3 + 4;
            long billing4 = billing(j29) + license(j29, j27, j23) + jArr2[i6] + jArr[i6] + j19;
            long j30 = j28 + billing4;
            long purchase4 = purchase(purchase3) + appmetrica(purchase3, purchase2, purchase) + billing4;
            int i8 = i3 + 5;
            long billing5 = billing(j30) + license(j30, j29, j27) + jArr2[i7] + jArr[i7] + j23;
            long j31 = purchase + billing5;
            long purchase5 = purchase(purchase4) + appmetrica(purchase4, purchase3, purchase2) + billing5;
            int i9 = i3 + 6;
            long billing6 = billing(j31) + license(j31, j30, j29) + jArr2[i8] + jArr[i8] + j27;
            long j32 = purchase2 + billing6;
            long purchase6 = purchase(purchase5) + appmetrica(purchase5, purchase4, purchase3) + billing6;
            int i10 = i3 + 7;
            long billing7 = billing(j32) + license(j32, j31, j30) + jArr2[i9] + jArr[i9] + j29;
            long j33 = purchase3 + billing7;
            long purchase7 = purchase(purchase6) + appmetrica(purchase6, purchase5, purchase4) + billing7;
            i3 += 8;
            long billing8 = billing(j33) + license(j33, j32, j31) + jArr2[i10] + jArr[i10] + j30;
            long j34 = purchase4 + billing8;
            long purchase8 = billing8 + purchase(purchase7) + appmetrica(purchase7, purchase6, purchase5);
            i2++;
            j17 = j33;
            j16 = purchase6;
            j15 = j34;
            j18 = j31;
            j14 = purchase7;
            j13 = purchase5;
            j11 = j32;
            j12 = purchase8;
        }
        this.f19000e += j12;
        this.f18999e += j14;
        this.f18994e += j16;
        this.f18997e += j13;
        this.f18990e += j15;
        this.f18995e += j17;
        this.f18988e += j11;
        this.f18987e += j18;
        this.f18993e = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            jArr[i11] = 0;
        }
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 128;
    }

    @Override // defpackage.InterfaceC0293e
    public void reset() {
        this.f18996e = 0L;
        this.f18986e = 0L;
        int i = 0;
        this.f18989e = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f18992e;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f18993e = 0;
        while (true) {
            long[] jArr = this.f18991e;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public final void startapp() {
        long j = this.f18996e;
        if (j > 2305843009213693951L) {
            this.f18986e += j >>> 61;
            this.f18996e = j & 2305843009213693951L;
        }
        long j2 = this.f18996e << 3;
        long j3 = this.f18986e;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.f18989e == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.f18993e > 14) {
            adcel();
        }
        long[] jArr = this.f18991e;
        jArr[14] = j3;
        jArr[15] = j2;
        adcel();
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f18989e;
        int i2 = i + 1;
        this.f18989e = i2;
        byte[] bArr = this.f18992e;
        bArr[i] = b;
        if (i2 == bArr.length) {
            this.f18991e[this.f18993e] = AbstractC3628e.license(0, bArr);
            int i3 = this.f18993e + 1;
            this.f18993e = i3;
            if (i3 == 16) {
                adcel();
            }
            this.f18989e = 0;
        }
        this.f18996e++;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        while (this.f18989e != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.f18992e;
            if (i2 < bArr2.length) {
                break;
            }
            this.f18991e[this.f18993e] = AbstractC3628e.license(i, bArr);
            int i3 = this.f18993e + 1;
            this.f18993e = i3;
            if (i3 == 16) {
                adcel();
            }
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f18996e += bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public final void yandex(AbstractC9567e abstractC9567e) {
        byte[] bArr = abstractC9567e.f18992e;
        System.arraycopy(bArr, 0, this.f18992e, 0, bArr.length);
        this.f18989e = abstractC9567e.f18989e;
        this.f18996e = abstractC9567e.f18996e;
        this.f18986e = abstractC9567e.f18986e;
        this.f19000e = abstractC9567e.f19000e;
        this.f18999e = abstractC9567e.f18999e;
        this.f18994e = abstractC9567e.f18994e;
        this.f18997e = abstractC9567e.f18997e;
        this.f18990e = abstractC9567e.f18990e;
        this.f18995e = abstractC9567e.f18995e;
        this.f18988e = abstractC9567e.f18988e;
        this.f18987e = abstractC9567e.f18987e;
        long[] jArr = abstractC9567e.f18991e;
        System.arraycopy(jArr, 0, this.f18991e, 0, jArr.length);
        this.f18993e = abstractC9567e.f18993e;
    }
}
