package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14598e {
    public final C6097e ad;

    public C14598e(C6097e c6097e) {
        this.ad = c6097e;
    }

    public final C1874e ad(InterfaceC16400e interfaceC16400e, C11725e c11725e, C0912e c0912e) {
        C5306e c5306e = this.ad.ad;
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (C5306e.license(c5306e) == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            C5306e.purchase(c5306e, 1);
            return C5306e.billing(c5306e, interfaceC16400e, c11725e, new C17469e((List) c0912e.f3331e, (C3936e) c0912e.f3332e, (List) c0912e.f3333e));
        } finally {
            Trace.endSection();
        }
    }

    public final void vip(AbstractC16510e... abstractC16510eArr) {
        C5306e c5306e = this.ad.ad;
        AbstractC16510e[] abstractC16510eArr2 = (AbstractC16510e[]) Arrays.copyOf(abstractC16510eArr, abstractC16510eArr.length);
        Trace.beginSection("CX:unbind");
        try {
            AbstractC13062e.metrica();
            if (C5306e.license(c5306e) == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            ((C11275e) c5306e.f11401e).mopub(new C17469e(AbstractC1660e.isPro(abstractC16510eArr2), null, C13664e.f27089e), (HashSet) c5306e.f11398e);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }
}
