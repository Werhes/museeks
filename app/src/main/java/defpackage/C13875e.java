package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13875e implements InterfaceC5204e, InterfaceC17956e, InterfaceC5617e, InterfaceC7998e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C13875e f27482e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C13875e f27483e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C13875e f27484e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f27485e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27486e;

    static {
        boolean z = true;
        f27483e = new C13875e(z, 0);
        int i = 1;
        f27484e = new C13875e(z, i);
        f27482e = new C13875e(false, i);
    }

    public C13875e(int i) {
        this.f27486e = i;
        switch (i) {
            case 10:
                return;
            default:
                this.f27485e = AbstractC2170e.ad.vip(SurfaceOrderQuirk.class) != null;
                return;
        }
    }

    public C13875e(C17714e c17714e, C17569e c17569e) {
        this.f27486e = 3;
        int i = c17569e.ad;
        ByteBuffer byteBuffer = c17569e.vip;
        AbstractC2301e.billing(i == 6 || i == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C2125e c2125e = new C2125e(min, bArr);
        if (c17714e.ad) {
            throw new Exception();
        }
        if (c2125e.purchase()) {
            this.f27485e = false;
            return;
        }
        int billing = c2125e.billing(2);
        boolean purchase = c2125e.purchase();
        if (c17714e.vip) {
            throw new Exception();
        }
        if (!purchase) {
            this.f27485e = true;
            return;
        }
        boolean purchase2 = (billing == 3 || billing == 0) ? true : c2125e.purchase();
        c2125e.amazon();
        if (!c17714e.license) {
            throw new Exception();
        }
        if (c2125e.purchase()) {
            if (!c17714e.appmetrica) {
                throw new Exception();
            }
            c2125e.amazon();
        }
        if (c17714e.metrica) {
            throw new Exception();
        }
        if (billing != 3) {
            c2125e.amazon();
        }
        c2125e.loadAd(c17714e.purchase);
        if (billing != 2 && billing != 0 && !purchase2) {
            c2125e.loadAd(3);
        }
        this.f27485e = ((billing == 3 || billing == 0) ? 255 : c2125e.billing(8)) != 0;
    }

    public /* synthetic */ C13875e(boolean z, int i) {
        this.f27486e = i;
        this.f27485e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7998e
    public /* bridge */ /* synthetic */ Object ad(C11467e c11467e) {
        C17841e ad;
        InputStream isPro = AbstractC17181e.isPro(c11467e);
        try {
            int i = 4096;
            if (this.f27485e) {
                if (isPro instanceof InterfaceC0489e) {
                    long length = ((InterfaceC0489e) isPro).ad().length();
                    if (length == 0) {
                        i = AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                ad = C17841e.ad(AbstractC3513e.m1366interface(isPro, i), true);
            } else {
                ad = C17841e.ad(AbstractC3513e.m1366interface(isPro, 4096), false);
            }
            AbstractC16704e.vip(isPro, null);
            return ad;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC16704e.vip(isPro, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC17956e
    public boolean appmetrica() {
        return this.f27485e;
    }

    @Override // defpackage.InterfaceC5617e
    public AbstractC9027e subs(ByteArrayInputStream byteArrayInputStream) {
        boolean z = this.f27485e;
        int i = z ? 32 : 56;
        byte[] bArr = new byte[i];
        AbstractC9460e.license(byteArrayInputStream, bArr, 0, i);
        return z ? new C11963e(0, bArr) : new C0719e(0, bArr);
    }

    public String toString() {
        switch (this.f27486e) {
            case 1:
                return AbstractC8703e.signatures(new StringBuilder("IncorrectFragmentation{expected="), !this.f27485e, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17956e
    public boolean vip(C16320e c16320e) {
        return this.f27485e;
    }
}
