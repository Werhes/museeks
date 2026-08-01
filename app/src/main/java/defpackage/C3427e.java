package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3427e extends AbstractC13616e implements InterfaceC13742e, InterfaceC14388e, InterfaceC4890e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C12431e f7663e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public PointerInputEventHandler f7664e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public Object[] f7665e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Object f7666e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Object f7667e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public long f7668e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C12431e f7669e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C8419e f7670e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C12431e f7671e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public C2561e f7672e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C2561e f7673e = AbstractC0845e.ad;

    public C3427e(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f7666e = obj;
        this.f7667e = obj2;
        this.f7665e = objArr;
        this.f7664e = pointerInputEventHandler;
        C12431e c12431e = new C12431e(0, new C14718e[16]);
        this.f7663e = c12431e;
        this.f7669e = c12431e;
        this.f7671e = new C12431e(0, new C14718e[16]);
        this.f7668e = 0L;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: catch */
    public final /* synthetic */ void mo708catch() {
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC4890e
    public final void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        this.f7668e = j;
        if (enumC13456e == EnumC13456e.f26729e) {
            this.f7673e = c2561e;
        }
        InterfaceC5083e interfaceC5083e = null;
        if (this.f7670e == null) {
            this.f7670e = AbstractC5336e.purchase(m3623e(), null, 4, new C7236e(this, interfaceC5083e, 24), 1);
        }
        m1362e(c2561e, enumC13456e);
        ?? r5 = c2561e.ad;
        int size = r5.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2561e = null;
                break;
            } else if (!AbstractC17957e.appmetrica((C2401e) r5.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f7672e = c2561e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC4653e.purchase(this, mo498new(f));
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void m1362e(C2561e c2561e, EnumC13456e enumC13456e) {
        C13578e c13578e;
        C13578e c13578e2;
        synchronized (this.f7669e) {
            C12431e c12431e = this.f7671e;
            c12431e.appmetrica(c12431e.f24868e, this.f7663e);
        }
        try {
            int ordinal = enumC13456e.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C12431e c12431e2 = this.f7671e;
                    int i = c12431e2.f24868e - 1;
                    Object[] objArr = c12431e2.f24870e;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            C14718e c14718e = (C14718e) objArr[i];
                            if (enumC13456e == c14718e.f29127e && (c13578e2 = c14718e.f29125e) != null) {
                                c14718e.f29125e = null;
                                c13578e2.billing(c2561e);
                            }
                            i--;
                        }
                    }
                    this.f7671e.startapp();
                }
                if (ordinal != 2) {
                    throw new C14803e(10);
                }
            }
            C12431e c12431e3 = this.f7671e;
            Object[] objArr2 = c12431e3.f24870e;
            int i2 = c12431e3.f24868e;
            for (int i3 = 0; i3 < i2; i3++) {
                C14718e c14718e2 = (C14718e) objArr2[i3];
                if (enumC13456e == c14718e2.f29127e && (c13578e = c14718e2.f29125e) != null) {
                    c14718e2.f29125e = null;
                    c13578e.billing(c2561e);
                }
            }
            this.f7671e.startapp();
        } catch (Throwable th) {
            this.f7671e.startapp();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eؘُٔ */
    public final void mo709e() {
        m1363e();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        m1363e();
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void m1363e() {
        C8419e c8419e = this.f7670e;
        if (c8419e != null) {
            c8419e.applovin(new AbstractC4233e("Pointer input was reset", 2));
            this.f7670e = null;
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        m1363e();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final Object m1364e(Function2 function2, InterfaceC5083e interfaceC5083e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        C14718e c14718e = new C14718e(this, c13578e);
        synchronized (this.f7669e) {
            this.f7663e.license(c14718e);
            new C2342e(AbstractC10558e.startapp(AbstractC10558e.yandex(c14718e, c14718e, function2)), EnumC2821e.f6782e).billing(Unit.INSTANCE);
        }
        c13578e.inmobi(new C10570e(5, c14718e));
        return c13578e.signatures();
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eّٔؖ */
    public final /* synthetic */ boolean mo716e() {
        return false;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return AbstractC5851e.mopub(this).f27604e.mo499package();
    }

    @Override // defpackage.InterfaceC4890e
    public final long pro() {
        return AbstractC15287e.ad;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        C2561e c2561e = this.f7672e;
        if (c2561e == null) {
            return;
        }
        ?? r1 = c2561e.ad;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((C2401e) r1.get(i)).license) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C2401e c2401e = (C2401e) r1.get(i2);
                    long j = c2401e.ad;
                    long j2 = c2401e.metrica;
                    long j3 = c2401e.vip;
                    float f = c2401e.appmetrica;
                    boolean z = c2401e.license;
                    arrayList.add(new C2401e(j, j3, j2, false, f, j3, j2, z, z, c2401e.startapp, 0L, 1.0f, 0L));
                }
                C2561e c2561e2 = new C2561e(arrayList, null);
                this.f7673e = c2561e2;
                m1362e(c2561e2, EnumC13456e.f26729e);
                m1362e(c2561e2, EnumC13456e.f26727e);
                m1362e(c2561e2, EnumC13456e.f26726e);
                this.f7672e = null;
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return AbstractC5851e.mopub(this).f27604e.vip();
    }
}
