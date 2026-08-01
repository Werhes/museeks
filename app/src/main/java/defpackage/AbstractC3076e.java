package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3076e {
    public final C12718e ad;
    public int vip;

    public AbstractC3076e(int i) {
        switch (i) {
            case 1:
                this.ad = new C12718e();
                return;
            default:
                this.ad = new C12718e();
                return;
        }
    }

    public void ad(byte[] bArr) {
        synchronized (this) {
            try {
                int i = this.vip;
                if (bArr.length + i < AbstractC16809e.ad) {
                    this.vip = i + (bArr.length / 2);
                    this.ad.addLast(bArr);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public char[] license(int i) {
        char[] cArr;
        synchronized (this) {
            C12718e c12718e = this.ad;
            cArr = null;
            char[] cArr2 = (char[]) (c12718e.isEmpty() ? null : c12718e.removeLast());
            if (cArr2 != null) {
                this.vip -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    public byte[] metrica(int i) {
        byte[] bArr;
        synchronized (this) {
            C12718e c12718e = this.ad;
            bArr = null;
            byte[] bArr2 = (byte[]) (c12718e.isEmpty() ? null : c12718e.removeLast());
            if (bArr2 != null) {
                this.vip -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public void vip(char[] cArr) {
        synchronized (this) {
            try {
                int i = this.vip;
                if (cArr.length + i < AbstractC16809e.ad) {
                    this.vip = i + cArr.length;
                    this.ad.addLast(cArr);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
