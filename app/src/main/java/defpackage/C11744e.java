package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11744e implements InterfaceC14230e, InterfaceC11149e {
    public final C13825e ad;
    public boolean adcel;
    public Integer advert;
    public InterfaceC7865e appmetrica;
    public long billing;
    public final C8591e metrica;
    public Integer mopub;
    public final InterfaceC4088e vip;
    public final Object license = new Object();
    public final ArrayList purchase = new ArrayList();
    public int yandex = 2;
    public int startapp = 1;

    public C11744e(C13825e c13825e, InterfaceC4088e interfaceC4088e, C8591e c8591e) {
        this.ad = c13825e;
        this.vip = interfaceC4088e;
        this.metrica = c8591e;
    }

    @Override // defpackage.InterfaceC11149e
    public final void ad(LinkedHashSet linkedHashSet) {
        InterfaceC5083e interfaceC5083e = null;
        AbstractC5336e.purchase(this.metrica.appmetrica, null, 0, new C10954e(interfaceC5083e, AbstractC13480e.m3582e(linkedHashSet), this, 18), 3);
    }

    public final int appmetrica() {
        int license;
        synchronized (this.license) {
            license = AbstractC18271e.license(this.ad.vip, license(this.yandex, this.adcel, this.mopub));
        }
        return license;
    }

    public final int license(int i, boolean z, Integer num) {
        int intValue = num != null ? num.intValue() : i != 0 ? i != 1 ? 1 : 3 : this.vip.startapp();
        if (z) {
            if (Build.VERSION.SDK_INT >= 28 && AbstractC18271e.license(this.ad.vip, 5) == 5) {
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
                }
                intValue = 5;
            }
        }
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + intValue);
        }
        return intValue;
    }

    public final void metrica(Exception exc) {
        List m3575continue;
        synchronized (this.license) {
            m3575continue = AbstractC13480e.m3575continue(this.purchase);
            this.purchase.clear();
        }
        Iterator it = m3575continue.iterator();
        while (it.hasNext()) {
            ((C8823e) ((InterfaceC6334e) it.next())).m2503e(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٓٞ, java.lang.Object] */
    public final C8823e purchase() {
        C8823e c8823e = new C8823e();
        ?? obj = new Object();
        synchronized (this.license) {
            this.purchase.add(c8823e);
            long j = this.billing + 1;
            this.billing = j;
            obj.f14622e = j;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC5336e.purchase(this.metrica.appmetrica, null, 0, new C10954e((InterfaceC5083e) null, this, (Object) obj, 19), 3);
        return c8823e;
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        synchronized (this.license) {
            this.adcel = false;
            this.mopub = null;
            this.advert = null;
            this.yandex = 2;
            this.startapp = 1;
            Unit unit = Unit.INSTANCE;
        }
        purchase();
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.appmetrica = interfaceC7865e;
        purchase();
    }
}
