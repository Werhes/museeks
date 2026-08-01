package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13136e extends AbstractC6102e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public boolean f26096e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final C16529e f26097e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public C3189e f26098e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public C2401e f26099e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public boolean f26100e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final C16529e f26101e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public boolean f26102e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public long f26103e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public C8419e f26104e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public long f26105e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public boolean f26106e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public boolean f26107e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public boolean f26108e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public C8419e f26109e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public C8419e f26110e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public Function0 f26111e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public boolean f26112e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public C8419e f26113e;

    public C13136e(InterfaceC17220e interfaceC17220e, C15274e c15274e, Function0 function0, Function0 function02, boolean z, boolean z2) {
        super(c15274e, interfaceC17220e, z, z2, null, null, function0);
        this.f26111e = function02;
        this.f26096e = true;
        C16529e c16529e = AbstractC2800e.ad;
        this.f26097e = new C16529e();
        this.f26101e = new C16529e();
        this.f26103e = -1L;
        this.f26105e = -1L;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC6102e, defpackage.InterfaceC4890e
    public final void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        super.crashlytics(c2561e, enumC13456e, j);
        if (enumC13456e != EnumC13456e.f26727e) {
            if (enumC13456e != EnumC13456e.f26726e || this.f26099e == null || this.f26112e) {
                return;
            }
            ?? r7 = c2561e.ad;
            int size = r7.size();
            for (int i = 0; i < size; i++) {
                C2401e c2401e = (C2401e) r7.get(i);
                if (c2401e.vip() && !c2401e.equals(this.f26099e)) {
                    m3531e(false);
                    return;
                }
            }
            return;
        }
        InterfaceC5083e interfaceC5083e = null;
        if (this.f26099e == null) {
            if (AbstractC9939e.purchase(c2561e, true, false)) {
                C2401e c2401e2 = (C2401e) c2561e.ad.get(0);
                c2401e2.ad();
                this.f26099e = c2401e2;
                if (this.f12798e) {
                    C8419e c8419e = this.f26104e;
                    if (c8419e != null && c8419e.purchase()) {
                        ((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).getClass();
                        if (c2401e2.vip - this.f26103e < 40) {
                            this.f26100e = true;
                            return;
                        }
                        this.f26107e = true;
                        C8419e c8419e2 = this.f26104e;
                        if (c8419e2 != null) {
                            c8419e2.Signature(null);
                        }
                        this.f26104e = null;
                    }
                    this.f26112e = false;
                    m2030e(c2401e2);
                    if (this.f26111e != null) {
                        this.f26110e = AbstractC5336e.purchase(m3623e(), null, 0, new C0066e(this, interfaceC5083e, 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = c2561e.metrica == 2;
        ?? r72 = c2561e.ad;
        if (z && !this.f26112e && this.f12798e && this.f26111e != null) {
            C8419e c8419e3 = this.f26110e;
            if (c8419e3 != null) {
                c8419e3.Signature(null);
            }
            this.f26110e = null;
            Function0 function0 = this.f26111e;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.f26096e) {
                ((C6169e) ((InterfaceC5178e) AbstractC10432e.vip(this, AbstractC11473e.advert))).ad(0);
            }
            this.f26112e = true;
        }
        if (this.f26112e) {
            int size2 = r72.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!AbstractC17957e.appmetrica((C2401e) r72.get(i2))) {
                    int size3 = r72.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C2401e) r72.get(i3)).ad();
                    }
                    return;
                }
            }
            C2401e c2401e3 = (C2401e) r72.get(0);
            c2401e3.ad();
            m3530e(c2401e3.vip, this.f26099e);
            return;
        }
        int size4 = r72.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!AbstractC17957e.license((C2401e) r72.get(i4))) {
                long m2029e = m2029e(j);
                int size5 = r72.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C2401e c2401e4 = (C2401e) r72.get(i5);
                    if (c2401e4.vip() || AbstractC17957e.yandex(c2401e4, j, m2029e)) {
                        m3531e(false);
                        return;
                    }
                }
                return;
            }
        }
        C2401e c2401e5 = (C2401e) r72.get(0);
        c2401e5.ad();
        m3530e(c2401e5.vip, this.f26099e);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        m3529e();
    }

    /* renamed from: eؒ٘ؗ, reason: contains not printable characters */
    public final void m3528e(long j, C3189e c3189e) {
        if (this.f12798e && !this.f26102e) {
            m2027e(c3189e.metrica, true);
            this.f26105e = j;
            if (!this.f26106e && !this.f26108e) {
                this.f12804e.invoke();
            }
        }
        this.f26098e = null;
        this.f26102e = false;
        this.f26108e = false;
        C8419e c8419e = this.f26109e;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.f26109e = null;
        this.f26106e = false;
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eّؔٞ */
    public final void mo2022e(KeyEvent keyEvent) {
        long startapp = AbstractC9835e.startapp(keyEvent);
        C16529e c16529e = this.f26097e;
        boolean z = false;
        if (c16529e.appmetrica(startapp) != null) {
            InterfaceC10500e interfaceC10500e = (InterfaceC10500e) c16529e.appmetrica(startapp);
            if (interfaceC10500e != null) {
                if (interfaceC10500e.purchase()) {
                    interfaceC10500e.Signature(null);
                } else {
                    z = true;
                }
            }
            c16529e.billing(startapp);
        }
        if (z) {
            return;
        }
        this.f12804e.invoke();
    }

    /* renamed from: eؙؙٝ, reason: contains not printable characters */
    public final void m3529e() {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        long j4;
        C16529e c16529e = this.f26097e;
        Object[] objArr = c16529e.metrica;
        long[] jArr = c16529e.ad;
        int length = jArr.length - 2;
        char c3 = 7;
        long j5 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            j2 = 128;
            while (true) {
                long j6 = jArr[i];
                j3 = 255;
                if ((((~j6) << c3) & j6 & j5) != j5) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j6 & 255) < 128) {
                            c2 = c3;
                            j4 = j5;
                            ((InterfaceC10500e) objArr[(i << 3) + i3]).Signature(null);
                        } else {
                            c2 = c3;
                            j4 = j5;
                        }
                        j6 >>= 8;
                        i3++;
                        c3 = c2;
                        j5 = j4;
                    }
                    c = c3;
                    j = j5;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j5;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
                j5 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        c16529e.ad();
        C16529e c16529e2 = this.f26101e;
        Object[] objArr2 = c16529e2.metrica;
        long[] jArr2 = c16529e2.ad;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j7 = jArr2[i4];
                if ((((~j7) << c) & j7 & j) != j) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j7 & j3) < j2) {
                            ((AbstractC14062e) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j7 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        c16529e2.ad();
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eٍؙّ */
    public final boolean mo2024e(KeyEvent keyEvent) {
        long startapp = AbstractC9835e.startapp(keyEvent);
        boolean z = false;
        if (this.f26111e != null) {
            C16529e c16529e = this.f26097e;
            if (c16529e.appmetrica(startapp) == null) {
                c16529e.yandex(startapp, AbstractC5336e.purchase(m3623e(), null, 0, new C0066e(this, null, 2), 3));
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eٌؙٞ */
    public final void mo2026e() {
        m3529e();
    }

    /* renamed from: eّٔؗ, reason: contains not printable characters */
    public final void m3530e(long j, C2401e c2401e) {
        if (this.f12798e && !this.f26100e) {
            m2027e(c2401e.metrica, false);
            this.f26103e = j;
            if (!this.f26112e && !this.f26107e) {
                this.f12804e.invoke();
            }
        }
        this.f26099e = null;
        this.f26100e = false;
        this.f26107e = false;
        C8419e c8419e = this.f26110e;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.f26110e = null;
        this.f26112e = false;
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eٖٔۧ */
    public final void mo860e(InterfaceC15671e interfaceC15671e) {
        if (this.f26111e != null) {
            C10479e c10479e = new C10479e(8, this);
            InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
            interfaceC15671e.appmetrica(AbstractC10789e.metrica, new C10591e(null, c10479e));
        }
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final void m3531e(boolean z) {
        if (z) {
            this.f26098e = null;
            C8419e c8419e = this.f26109e;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            this.f26109e = null;
            C8419e c8419e2 = this.f26113e;
            if (c8419e2 != null) {
                c8419e2.Signature(null);
            }
            this.f26113e = null;
            this.f26108e = false;
            this.f26106e = false;
            this.f26105e = -1L;
            this.f26102e = false;
        } else {
            this.f26099e = null;
            C8419e c8419e3 = this.f26110e;
            if (c8419e3 != null) {
                c8419e3.Signature(null);
            }
            this.f26110e = null;
            C8419e c8419e4 = this.f26104e;
            if (c8419e4 != null) {
                c8419e4.Signature(null);
            }
            this.f26104e = null;
            this.f26107e = false;
            this.f26112e = false;
            this.f26103e = -1L;
            this.f26100e = false;
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
        int i = 0;
        if (enumC13456e != EnumC13456e.f26727e) {
            if (enumC13456e != EnumC13456e.f26726e || this.f26098e == null || this.f26106e) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                C3189e c3189e = (C3189e) arrayList.get(i);
                if (c3189e.startapp && !c3189e.equals(this.f26098e)) {
                    m3531e(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f26098e == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC7291e.license((C3189e) arrayList.get(i2))) {
                    C3189e c3189e2 = (C3189e) arrayList.get(0);
                    c3189e2.startapp = true;
                    this.f26098e = c3189e2;
                    if (this.f12798e) {
                        C8419e c8419e = this.f26113e;
                        InterfaceC5083e interfaceC5083e = null;
                        if (c8419e != null && c8419e.purchase()) {
                            ((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).getClass();
                            if (c3189e2.vip - this.f26105e < 40) {
                                this.f26102e = true;
                                return;
                            }
                            this.f26108e = true;
                            C8419e c8419e2 = this.f26113e;
                            if (c8419e2 != null) {
                                c8419e2.Signature(null);
                            }
                            this.f26113e = null;
                        }
                        this.f26106e = false;
                        m2028e(c3189e2);
                        if (this.f26111e != null) {
                            this.f26109e = AbstractC5336e.purchase(m3623e(), null, 0, new C0066e(this, interfaceC5083e, 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f26106e) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C3189e c3189e3 = (C3189e) arrayList.get(i3);
                if (!c3189e3.yandex || c3189e3.license) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((C3189e) arrayList.get(i)).startapp = true;
                        i++;
                    }
                    return;
                }
            }
            C3189e c3189e4 = (C3189e) arrayList.get(0);
            c3189e4.startapp = true;
            m3528e(c3189e4.vip, this.f26098e);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            C3189e c3189e5 = (C3189e) arrayList.get(i4);
            if (c3189e5.startapp || !c3189e5.yandex || c3189e5.license) {
                float purchase = ((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).purchase();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    C3189e c3189e6 = (C3189e) arrayList.get(i5);
                    boolean z = Math.abs(C2152e.metrica(C2152e.yandex(c3189e6.metrica, this.f26098e.metrica))) > purchase;
                    if (c3189e6.startapp || z) {
                        m3531e(true);
                        return;
                    }
                }
                return;
            }
        }
        C3189e c3189e7 = (C3189e) arrayList.get(0);
        c3189e7.startapp = true;
        m3528e(c3189e7.vip, this.f26098e);
    }

    @Override // defpackage.AbstractC6102e, defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        super.mo720protected();
        m3531e(false);
    }

    @Override // defpackage.InterfaceC1946e
    /* renamed from: switch */
    public final void mo733switch() {
        m3531e(true);
    }
}
