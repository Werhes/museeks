package defpackage;

import java.util.Hashtable;

/* renamed from: eَٝؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10398e implements InterfaceC11306e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Hashtable f20545e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC0554e f20546e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f20547e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f20548e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC0554e f20549e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0293e f20550e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f20551e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f20552e;

    static {
        Hashtable hashtable = new Hashtable();
        f20545e = hashtable;
        hashtable.put("GOST3411", 32);
        hashtable.put("MD2", 16);
        hashtable.put("MD4", 64);
        hashtable.put("MD5", 64);
        hashtable.put("RIPEMD128", 64);
        hashtable.put("RIPEMD160", 64);
        hashtable.put("SHA-1", 64);
        hashtable.put("SHA-224", 64);
        hashtable.put("SHA-256", 64);
        hashtable.put("SHA-384", 128);
        hashtable.put("SHA-512", 128);
        hashtable.put("Tiger", 64);
        hashtable.put("Whirlpool", 64);
    }

    public C10398e(InterfaceC0293e interfaceC0293e) {
        int intValue;
        if (interfaceC0293e instanceof InterfaceC1196e) {
            intValue = ((InterfaceC1196e) interfaceC0293e).getByteLength();
        } else {
            Integer num = (Integer) f20545e.get(interfaceC0293e.getAlgorithmName());
            if (num == null) {
                throw new IllegalArgumentException("unknown digest passed: " + interfaceC0293e.getAlgorithmName());
            }
            intValue = num.intValue();
        }
        this.f20550e = interfaceC0293e;
        int digestSize = interfaceC0293e.getDigestSize();
        this.f20548e = digestSize;
        this.f20547e = intValue;
        this.f20552e = new byte[intValue];
        this.f20551e = new byte[intValue + digestSize];
    }

    @Override // defpackage.InterfaceC11306e
    public final int doFinal(byte[] bArr, int i) {
        InterfaceC0293e interfaceC0293e = this.f20550e;
        byte[] bArr2 = this.f20551e;
        int i2 = this.f20547e;
        interfaceC0293e.doFinal(bArr2, i2);
        InterfaceC0554e interfaceC0554e = this.f20546e;
        if (interfaceC0554e != null) {
            ((InterfaceC0554e) interfaceC0293e).vip(interfaceC0554e);
            interfaceC0293e.update(bArr2, i2, interfaceC0293e.getDigestSize());
        } else {
            interfaceC0293e.update(bArr2, 0, bArr2.length);
        }
        int doFinal = interfaceC0293e.doFinal(bArr, 0);
        while (i2 < bArr2.length) {
            bArr2[i2] = 0;
            i2++;
        }
        InterfaceC0554e interfaceC0554e2 = this.f20549e;
        if (interfaceC0554e2 != null) {
            ((InterfaceC0554e) interfaceC0293e).vip(interfaceC0554e2);
            return doFinal;
        }
        byte[] bArr3 = this.f20552e;
        interfaceC0293e.update(bArr3, 0, bArr3.length);
        return doFinal;
    }

    @Override // defpackage.InterfaceC11306e
    public final String getAlgorithmName() {
        return this.f20550e.getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.InterfaceC11306e
    public final int getMacSize() {
        return this.f20548e;
    }

    @Override // defpackage.InterfaceC11306e
    public final void init(InterfaceC3894e interfaceC3894e) {
        InterfaceC0293e interfaceC0293e = this.f20550e;
        interfaceC0293e.reset();
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        int length = bArr.length;
        byte[] bArr2 = this.f20552e;
        int i = this.f20547e;
        if (length > i) {
            interfaceC0293e.update(bArr, 0, length);
            interfaceC0293e.doFinal(bArr2, 0);
            length = this.f20548e;
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        while (length < bArr2.length) {
            bArr2[length] = 0;
            length++;
        }
        byte[] bArr3 = this.f20551e;
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ 54);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ 92);
        }
        boolean z = interfaceC0293e instanceof InterfaceC0554e;
        if (z) {
            InterfaceC0554e ad = ((InterfaceC0554e) interfaceC0293e).ad();
            this.f20546e = ad;
            ((InterfaceC0293e) ad).update(bArr3, 0, i);
        }
        interfaceC0293e.update(bArr2, 0, bArr2.length);
        if (z) {
            this.f20549e = ((InterfaceC0554e) interfaceC0293e).ad();
        }
    }

    @Override // defpackage.InterfaceC11306e
    public final void reset() {
        InterfaceC0554e interfaceC0554e = this.f20549e;
        InterfaceC0293e interfaceC0293e = this.f20550e;
        if (interfaceC0554e != null) {
            ((InterfaceC0554e) interfaceC0293e).vip(interfaceC0554e);
            return;
        }
        interfaceC0293e.reset();
        byte[] bArr = this.f20552e;
        interfaceC0293e.update(bArr, 0, bArr.length);
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte b) {
        this.f20550e.update(b);
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte[] bArr, int i, int i2) {
        this.f20550e.update(bArr, i, i2);
    }
}
