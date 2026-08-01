package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18345e extends BasePendingResult {
    public final boolean pro;
    public C0444e remoteconfig;
    public final /* synthetic */ C5710e signatures;

    public AbstractC18345e(C5710e c5710e, boolean z) {
        Objects.requireNonNull(c5710e);
        this.signatures = c5710e;
        this.pro = z;
    }

    public final void Signature() {
        if (!this.pro) {
            C5710e c5710e = this.signatures;
            Iterator it = c5710e.billing.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            Iterator it2 = c5710e.yandex.iterator();
            while (it2.hasNext()) {
                ((C8327e) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.signatures.ad) {
                amazon();
            }
        } catch (C9100e unused) {
            adcel(new C18444e(this, new Status(2100, null, null, null)));
        }
    }

    public abstract void amazon();

    public final InterfaceC10846e loadAd() {
        if (this.remoteconfig == null) {
            this.remoteconfig = new C0444e(this);
        }
        return this.remoteconfig;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC18082e purchase(Status status) {
        return new C18444e(this, status);
    }
}
