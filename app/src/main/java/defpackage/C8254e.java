package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8254e extends AbstractC13110e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f16755e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f16756e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f16757e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C6613e f16758e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f16759e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f16760e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f16761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8254e(C6613e c6613e, InterfaceC0274e interfaceC0274e, long j, boolean z) {
        super(interfaceC0274e);
        this.f16758e = c6613e;
        this.f16757e = j;
        this.f16756e = z;
        this.f16761e = z;
    }

    public final IOException ad(IOException iOException) {
        if (this.f16759e) {
            return iOException;
        }
        this.f16759e = true;
        return C6613e.ad(this.f16758e, this.f16756e, iOException, 4);
    }

    @Override // defpackage.AbstractC13110e, defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16760e) {
            return;
        }
        this.f16760e = true;
        long j = this.f16757e;
        if (j != -1 && this.f16755e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            ad(null);
        } catch (IOException e) {
            throw ad(e);
        }
    }

    @Override // defpackage.AbstractC13110e, defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            throw ad(e);
        }
    }

    @Override // defpackage.AbstractC13110e, defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        if (this.f16760e) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f16757e;
        if (j2 != -1 && this.f16755e + j > j2) {
            StringBuilder inmobi = AbstractC1786e.inmobi(j2, "expected ", " bytes but received ");
            inmobi.append(this.f16755e + j);
            throw new ProtocolException(inmobi.toString());
        }
        try {
            if (this.f16761e) {
                this.f16761e = false;
            }
            super.mo272transient(c16151e, j);
            this.f16755e += j;
        } catch (IOException e) {
            throw ad(e);
        }
    }
}
