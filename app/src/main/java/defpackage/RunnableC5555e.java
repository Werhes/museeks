package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5555e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11886e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f11887e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f11888e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11889e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11890e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11891e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11892e;

    public /* synthetic */ RunnableC5555e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f11890e = i;
        this.f11888e = obj;
        this.f11887e = obj2;
        this.f11889e = obj3;
        this.f11886e = obj4;
        this.f11892e = obj5;
        this.f11891e = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12478e crashlytics;
        int i = this.f11890e;
        Object obj = this.f11891e;
        Object obj2 = this.f11892e;
        Object obj3 = this.f11886e;
        Object obj4 = this.f11889e;
        Object obj5 = this.f11887e;
        Object obj6 = this.f11888e;
        switch (i) {
            case 0:
                C1839e c1839e = (C1839e) obj6;
                EnumC7792e enumC7792e = (EnumC7792e) obj5;
                List list = (List) obj4;
                C10566e c10566e = (C10566e) obj3;
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) obj2;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC13717e adcel = AbstractC12909e.adcel();
                    C12478e c12478e = adcel instanceof C12478e ? (C12478e) adcel : null;
                    if (c12478e == null || (crashlytics = c12478e.crashlytics(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC13717e adcel2 = crashlytics.adcel();
                        try {
                            C1839e license = AbstractC15890e.license(c1839e, enumC7792e);
                            if (list == null) {
                                list = C13664e.f27089e;
                            }
                            C18464e c18464e = new C18464e(c10566e, license, list, interfaceC14388e, interfaceC2141e);
                            c18464e.mo2750extends();
                            c18464e.yandex();
                            Unit unit = Unit.INSTANCE;
                            AbstractC13717e.admob(adcel2);
                            crashlytics.isVip().ad();
                            return;
                        } catch (Throwable th) {
                            AbstractC13717e.admob(adcel2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                            crashlytics.metrica();
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                ((C18464e) obj6).m4500e((InterfaceC2881e) obj5, (InterfaceC2881e) obj4, (C4753e) obj3, (C4753e) obj2, (Map.Entry) obj);
                return;
        }
    }
}
