package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4878e extends AbstractC8548e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f10348e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f10349e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f10350e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C6613e f10351e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f10352e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f10353e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f10354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4878e(C6613e c6613e, InterfaceC2537e interfaceC2537e, long j, boolean z) {
        super(interfaceC2537e);
        this.f10351e = c6613e;
        this.f10350e = j;
        this.f10349e = z;
        this.f10348e = true;
        if (j == 0) {
            ad(null);
        }
    }

    public final IOException ad(IOException iOException) {
        if (this.f10354e) {
            return iOException;
        }
        this.f10354e = true;
        if (iOException == null && this.f10348e) {
            this.f10348e = false;
        }
        return C6613e.ad(this.f10351e, this.f10349e, iOException, 8);
    }

    @Override // defpackage.AbstractC8548e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10353e) {
            return;
        }
        this.f10353e = true;
        try {
            super.close();
            ad(null);
        } catch (IOException e) {
            throw ad(e);
        }
    }

    @Override // defpackage.AbstractC8548e, defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        C6613e c6613e = this.f10351e;
        if (this.f10353e) {
            throw new IllegalStateException("closed");
        }
        try {
            long signatures = this.f17361e.signatures(c16151e, j);
            if (this.f10348e) {
                this.f10348e = false;
            }
            if (signatures == -1) {
                ad(null);
                return -1L;
            }
            long j2 = this.f10352e + signatures;
            long j3 = this.f10350e;
            if (j3 == -1 || j2 <= j3) {
                this.f10352e = j2;
                if (((InterfaceC8246e) c6613e.f13645e).metrica()) {
                    ad(null);
                }
                return signatures;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw ad(e);
        }
    }
}
