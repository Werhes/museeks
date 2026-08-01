package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: eؘٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15236e extends ByteArrayOutputStream {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30140e;

    public /* synthetic */ C15236e(int i) {
        this.f30140e = i;
    }

    private final synchronized void Signature() {
        Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
        ((ByteArrayOutputStream) this).count = 0;
    }

    private final synchronized void loadAd() {
        Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
        ((ByteArrayOutputStream) this).count = 0;
    }

    public void ad() {
        Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
    }

    public byte[] advert() {
        switch (this.f30140e) {
            case 0:
                return ((ByteArrayOutputStream) this).buf;
            case 1:
            case 2:
            default:
                return ((ByteArrayOutputStream) this).buf;
            case 3:
                return ((ByteArrayOutputStream) this).buf;
            case 4:
                return ((ByteArrayOutputStream) this).buf;
        }
    }

    public synchronized boolean inmobi(C6740e c6740e, byte[] bArr, byte[] bArr2) {
        if (114 != bArr2.length) {
            reset();
            return false;
        }
        byte[] bArr3 = ((ByteArrayOutputStream) this).buf;
        int i = ((ByteArrayOutputStream) this).count;
        c6740e.getClass();
        if (bArr == null) {
            throw new NullPointerException("'ctx' cannot be null");
        }
        if (bArr.length > 255) {
            throw new IllegalArgumentException("ctx");
        }
        boolean yandex = AbstractC3995e.yandex(bArr2, c6740e.f13936e, bArr, (byte) 0, bArr3, i);
        reset();
        return yandex;
    }

    public synchronized boolean isVip(C5249e c5249e, byte[] bArr) {
        if (64 != bArr.length) {
            reset();
            return false;
        }
        boolean yandex = AbstractC6286e.yandex(bArr, c5249e.f11320e, (byte) 0, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
        reset();
        return yandex;
    }

    public synchronized byte[] license(C1694e c1694e) {
        byte[] bArr;
        bArr = new byte[64];
        byte[] bArr2 = ((ByteArrayOutputStream) this).buf;
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr3 = new byte[32];
        AbstractC6286e.metrica(c1694e.ad().f11320e, bArr3, 0);
        AbstractC6286e.billing(c1694e.f4625e, bArr3, (byte) 0, bArr2, i, bArr);
        reset();
        return bArr;
    }

    public synchronized byte[] purchase(C17565e c17565e, byte[] bArr) {
        byte[] bArr2;
        bArr2 = new byte[114];
        c17565e.vip(((ByteArrayOutputStream) this).count, bArr, ((ByteArrayOutputStream) this).buf, bArr2);
        reset();
        return bArr2;
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized void reset() {
        switch (this.f30140e) {
            case 1:
                loadAd();
                return;
            case 2:
                Signature();
                return;
            default:
                super.reset();
                return;
        }
    }
}
