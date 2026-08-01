package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13934e extends AbstractC1101e {
    public final Function0 metrica;
    public final Long vip;

    public C13934e(InterfaceC8850e interfaceC8850e, Long l, Function0 function0) {
        this.vip = l;
        this.metrica = function0;
    }

    @Override // defpackage.AbstractC1101e
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.AbstractC1101e
    public final C14133e license() {
        return null;
    }

    @Override // defpackage.AbstractC1101e
    public final long metrica() {
        Long l = this.vip;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.AbstractC1101e
    public final void mopub(InterfaceC11855e interfaceC11855e) {
        ?? r6;
        try {
            C5476e appmetrica = AbstractC8636e.appmetrica(new C7404e(0, (InterfaceC13033e) this.metrica.invoke()));
            Long th = null;
            try {
                Long valueOf = Long.valueOf(interfaceC11855e.mo2629class(appmetrica));
                try {
                    appmetrica.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                Long l = th;
                th = valueOf;
                r6 = l;
            } catch (Throwable th3) {
                try {
                    appmetrica.close();
                    r6 = th3;
                } catch (Throwable th4) {
                    AbstractC13362e.license(th3, th4);
                    r6 = th3;
                }
            }
            if (r6 != 0) {
                throw r6;
            }
            th.getClass();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th5) {
            throw new IOException(th5);
        }
    }
}
