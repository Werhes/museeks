package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1051e extends AbstractC13110e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C16151e f3538e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f3539e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖۢ, eّؑۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eؒٓۗ, eؙْٟ, eّؑۥ] */
    public static C16151e ad(C16151e c16151e) {
        ?? obj = new Object();
        ?? abstractC13110e = new AbstractC13110e(obj);
        abstractC13110e.f3539e = false;
        abstractC13110e.f3538e = obj;
        c16151e.mo1689throw(abstractC13110e);
        return obj;
    }

    @Override // defpackage.AbstractC13110e, defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // defpackage.AbstractC13110e, defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        C16151e c16151e = this.f3538e;
        if (this.f3539e) {
            c16151e.m4128final(255);
            this.f3539e = false;
        }
        c16151e.getClass();
    }

    @Override // defpackage.AbstractC13110e, defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        C16151e c16151e2 = this.f3538e;
        for (int i = 0; i < j; i++) {
            byte readByte = c16151e.readByte();
            if (this.f3539e) {
                c16151e2.m4128final(-1);
                this.f3539e = false;
                if (readByte != 0) {
                    if (-1 != readByte) {
                        this.f3539e = false;
                        c16151e2.m4128final(readByte);
                    } else {
                        this.f3539e = true;
                    }
                }
            } else if (-1 == readByte) {
                this.f3539e = true;
            } else {
                c16151e2.m4128final(readByte);
            }
        }
    }
}
