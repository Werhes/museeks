package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۥؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6775e extends C9924e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public Function1 f13975e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C8845e f13976e;

    @Override // defpackage.AbstractC5397e, defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        View crashlytics = AbstractC13482e.crashlytics(this);
        C8845e c8845e = this.f13976e;
        if (c8845e != null) {
            int i = c8845e.signatures - 1;
            c8845e.signatures = i;
            if (i == 0) {
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                AbstractC4387e.metrica(crashlytics, null);
                AbstractC2016e.subscription(crashlytics, null);
                crashlytics.removeOnAttachStateChangeListener(c8845e.tapsense);
            }
        }
        super.mo228e();
    }

    @Override // defpackage.AbstractC5397e, defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        View crashlytics = AbstractC13482e.crashlytics(this);
        WeakHashMap weakHashMap = C8845e.isVip;
        C8845e remoteconfig = C16728e.remoteconfig(crashlytics);
        remoteconfig.ad(crashlytics);
        InterfaceC11968e interfaceC11968e = (InterfaceC11968e) this.f13975e.invoke(remoteconfig);
        if (!AbstractC7890e.billing(interfaceC11968e, this.f19629e)) {
            this.f19629e = interfaceC11968e;
            mo1899e();
        }
        this.f13976e = remoteconfig;
        super.mo229e();
    }
}
