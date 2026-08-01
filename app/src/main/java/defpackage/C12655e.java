package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12655e extends AbstractC6102e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public C3189e f25376e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public C2401e f25377e;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.AbstractC6102e, defpackage.InterfaceC4890e
    public final void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        super.crashlytics(c2561e, enumC13456e, j);
        if (enumC13456e != EnumC13456e.f26727e) {
            if (enumC13456e != EnumC13456e.f26726e || this.f25377e == null) {
                return;
            }
            ?? r7 = c2561e.ad;
            int size = r7.size();
            for (int i = 0; i < size; i++) {
                C2401e c2401e = (C2401e) r7.get(i);
                if (c2401e.vip() && !c2401e.equals(this.f25377e)) {
                    m3373e(false);
                    return;
                }
            }
            return;
        }
        if (this.f25377e == null) {
            if (AbstractC9939e.purchase(c2561e, true, false)) {
                C2401e c2401e2 = (C2401e) c2561e.ad.get(0);
                c2401e2.ad();
                this.f25377e = c2401e2;
                if (this.f12798e) {
                    m2030e(c2401e2);
                    return;
                }
                return;
            }
            return;
        }
        ?? r72 = c2561e.ad;
        int size2 = r72.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC17957e.license((C2401e) r72.get(i2))) {
                long m2029e = m2029e(j);
                int size3 = r72.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C2401e c2401e3 = (C2401e) r72.get(i3);
                    if (c2401e3.vip() || AbstractC17957e.yandex(c2401e3, j, m2029e)) {
                        m3373e(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C2401e) r72.get(0)).ad();
        if (this.f12798e) {
            m2027e(this.f25377e.metrica, false);
            this.f12804e.invoke();
        }
        this.f25377e = null;
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eّؔٞ */
    public final void mo2022e(KeyEvent keyEvent) {
        this.f12804e.invoke();
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eٍؙّ */
    public final boolean mo2024e(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final void m3373e(boolean z) {
        if (z) {
            this.f25376e = null;
        } else {
            this.f25377e = null;
        }
        m2031e(z);
    }

    @Override // defpackage.InterfaceC1946e
    public final void isVip(Csuper csuper, EnumC13456e enumC13456e) {
        ArrayList arrayList = (ArrayList) csuper.f36469e;
        m2023e();
        if (this.f12798e && this.f12795e == null) {
            C5943e c5943e = new C5943e(this);
            m2050e(c5943e);
            this.f12795e = c5943e;
        }
        if (enumC13456e != EnumC13456e.f26727e) {
            if (enumC13456e != EnumC13456e.f26726e || this.f25376e == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3189e c3189e = (C3189e) arrayList.get(i);
                if (c3189e.startapp && !c3189e.equals(this.f25376e)) {
                    m3373e(true);
                    return;
                }
            }
            return;
        }
        if (this.f25376e == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC7291e.license((C3189e) arrayList.get(i2))) {
                    C3189e c3189e2 = (C3189e) arrayList.get(0);
                    c3189e2.startapp = true;
                    this.f25376e = c3189e2;
                    if (this.f12798e) {
                        m2028e(c3189e2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C3189e c3189e3 = (C3189e) arrayList.get(i3);
            if (c3189e3.startapp || !c3189e3.yandex || c3189e3.license) {
                float purchase = ((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).purchase();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C3189e c3189e4 = (C3189e) arrayList.get(i4);
                    boolean z = Math.abs(C2152e.metrica(C2152e.yandex(c3189e4.metrica, this.f25376e.metrica))) > purchase;
                    if (c3189e4.startapp || z) {
                        m3373e(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C3189e) arrayList.get(0)).startapp = true;
        if (this.f12798e) {
            m2027e(this.f25376e.metrica, true);
            this.f12804e.invoke();
        }
        this.f25376e = null;
    }

    @Override // defpackage.AbstractC6102e, defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        super.mo720protected();
        m3373e(false);
    }

    @Override // defpackage.InterfaceC1946e
    /* renamed from: switch */
    public final void mo733switch() {
        m3373e(true);
    }
}
