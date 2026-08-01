package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٛؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14817e extends AbstractC13367e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f29342e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14005e f29343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14817e(C14005e c14005e, C15718e c15718e, long j) {
        super(c14005e, c15718e);
        this.f29343e = c14005e;
        this.f29342e = j;
        if (j == 0) {
            ad(C15793e.f31108e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f26622e) {
            return;
        }
        if (this.f29342e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = AbstractC16286e.billing(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f29343e.vip.ad();
                ad(C14005e.purchase);
            }
        }
        this.f26622e = true;
    }

    @Override // defpackage.AbstractC13367e, defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (this.f26622e) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f29342e;
        if (j2 == 0) {
            return -1L;
        }
        long signatures = super.signatures(c16151e, Math.min(j2, j));
        if (signatures == -1) {
            this.f29343e.vip.ad();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            ad(C14005e.purchase);
            throw protocolException;
        }
        long j3 = this.f29342e - signatures;
        this.f29342e = j3;
        if (j3 == 0) {
            ad(C15793e.f31108e);
        }
        return signatures;
    }
}
