package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5552e extends AbstractC13616e implements InterfaceC17303e, InterfaceC8501e, InterfaceC17453e, InterfaceC4890e, InterfaceC4238e, InterfaceC0862e, InterfaceC18105e, InterfaceC9629e, InterfaceC13046e, InterfaceC6505e, InterfaceC5487e, InterfaceC10614e, InterfaceC2961e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC8177e f11884e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public HashSet f11885e;

    @Override // defpackage.InterfaceC18105e
    public final void Signature(InterfaceC0043e interfaceC0043e) {
    }

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return ((InterfaceC16827e) this.f11884e).ad(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        int i;
        C0500e mo346e = ((InterfaceC11183e) this.f11884e).mo346e();
        C0500e c0500e = (C0500e) interfaceC15671e;
        C0583e c0583e = c0500e.f2578e;
        if (mo346e.f2575e) {
            c0500e.f2575e = true;
        }
        if (mo346e.f2577e) {
            c0500e.f2577e = true;
        }
        C0583e c0583e2 = mo346e.f2578e;
        Object[] objArr = c0583e2.vip;
        Object[] objArr2 = c0583e2.metrica;
        long[] jArr = c0583e2.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        C16591e c16591e = (C16591e) obj;
                        if (!c0583e.vip(c16591e)) {
                            c0583e.amazon(c16591e, obj2);
                        } else if (obj2 instanceof C10591e) {
                            C10591e c10591e = (C10591e) c0583e.billing(c16591e);
                            i = i3;
                            String str = c10591e.ad;
                            if (str == null) {
                                str = ((C10591e) obj2).ad;
                            }
                            InterfaceC12561e interfaceC12561e = c10591e.vip;
                            if (interfaceC12561e == null) {
                                interfaceC12561e = ((C10591e) obj2).vip;
                            }
                            c0583e.amazon(c16591e, new C10591e(str, interfaceC12561e));
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return ((InterfaceC16827e) this.f11884e).billing(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final void mo292case() {
        AbstractC12640e.advert(this);
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: catch */
    public final void mo708catch() {
        C9556e c9556e = ((C13760e) this.f11884e).f27259e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC4890e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void crashlytics(defpackage.C2561e r10, defpackage.EnumC13456e r11, long r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5552e.crashlytics(eؔٓؔ, eْۘٞ, long):void");
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eؘُٔ */
    public final void mo709e() {
        mo720protected();
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        ((C16862e) this.f11884e).f33039e.getClass();
        c4017e.ad();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        if (this.f11884e instanceof C13760e) {
            mo720protected();
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        if (!this.f27016e) {
            AbstractC14070e.metrica("unInitializeModifier called on unattached node");
        }
        if ((this.f27014e & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).crashlytics();
        }
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m1940e(boolean z) {
        if (!this.f27016e) {
            AbstractC14070e.metrica("initializeModifier called on unattached node");
        }
        InterfaceC8177e interfaceC8177e = this.f11884e;
        if ((this.f27014e & 4) != 0 && !z) {
            AbstractC1599e.appmetrica(this);
        }
        if ((this.f27014e & 2) != 0) {
            if (((C9011e) AbstractC5851e.mopub(this).f27592e.purchase).f18076e) {
                AbstractC17732e abstractC17732e = this.f27018e;
                ((C9157e) abstractC17732e).m2523e(this);
                InterfaceC0983e interfaceC0983e = abstractC17732e.f34778e;
                if (interfaceC0983e != null) {
                    ((C5048e) interfaceC0983e).invalidate();
                }
            }
            if (!z) {
                AbstractC1599e.appmetrica(this);
                AbstractC5851e.mopub(this).m3710goto();
            }
        }
        if (interfaceC8177e instanceof C6827e) {
            C6827e c6827e = (C6827e) interfaceC8177e;
            C13915e mopub = AbstractC5851e.mopub(this);
            switch (c6827e.f14059e) {
                case 0:
                    ((C8202e) c6827e.f14058e).adcel = mopub;
                    break;
                case 1:
                    ((C4993e) c6827e.f14058e).advert = mopub;
                    break;
                case 2:
                    ((C13713e) c6827e.f14058e).yandex = mopub;
                    break;
                default:
                    ((AbstractC16904e) c6827e.f14058e).inmobi.setValue(mopub);
                    break;
            }
        }
        if ((this.f27014e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (interfaceC8177e instanceof AbstractC8704e) && ((C9011e) AbstractC5851e.mopub(this).f27592e.purchase).f18076e) {
            AbstractC5851e.mopub(this).m3710goto();
        }
        int i = this.f27014e;
        if ((i & 16) != 0 && (interfaceC8177e instanceof C13760e)) {
            ((C13760e) interfaceC8177e).f27259e.f18968e = this.f27018e;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).crashlytics();
        }
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eّٔؖ */
    public final boolean mo716e() {
        ((C13760e) this.f11884e).f27259e.getClass();
        return true;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        m1940e(true);
    }

    @Override // defpackage.InterfaceC2961e
    public final EnumC7792e getLayoutDirection() {
        return AbstractC5851e.mopub(this).f27610e;
    }

    @Override // defpackage.InterfaceC10614e
    public final boolean isPro() {
        return this.f27016e;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        return ((InterfaceC16827e) this.f11884e).license(interfaceC13158e, interfaceC16719e, j);
    }

    @Override // defpackage.InterfaceC0862e
    public final Object metrica(InterfaceC14388e interfaceC14388e, Object obj) {
        return ((InterfaceC0684e) this.f11884e).metrica(interfaceC14388e, obj);
    }

    @Override // defpackage.InterfaceC4238e
    /* renamed from: private */
    public final AbstractC16982e mo344private() {
        return C5454e.metrica;
    }

    @Override // defpackage.InterfaceC4890e
    public final long pro() {
        return AbstractC15287e.ad;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        C9556e c9556e = ((C13760e) this.f11884e).f27259e;
        C13760e c13760e = (C13760e) c9556e.f18969e;
        if (c9556e.f18970e == 2) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            C8513e c8513e = c13760e.f27260e;
            if (c8513e == null) {
                c8513e = null;
            }
            c8513e.invoke(obtain);
            Unit unit = Unit.INSTANCE;
            obtain.recycle();
            c9556e.f18970e = 1;
            c13760e.f27257e = false;
            c9556e.f18967e = null;
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return ((InterfaceC16827e) this.f11884e).purchase(abstractC9292e, interfaceC16719e, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.InterfaceC4238e
    /* renamed from: return */
    public final Object mo345return(C15816e c15816e) {
        C14742e c14742e;
        this.f11885e.add(c15816e);
        if (!this.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e = this.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(this);
        while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 32) != 0) {
                while (abstractC13616e != null) {
                    if ((abstractC13616e.f27014e & 32) != 0) {
                        AbstractC6126e abstractC6126e = abstractC13616e;
                        ?? r4 = 0;
                        while (abstractC6126e != 0) {
                            if (abstractC6126e instanceof InterfaceC4238e) {
                                InterfaceC4238e interfaceC4238e = (InterfaceC4238e) abstractC6126e;
                                if (interfaceC4238e.mo344private().ad(c15816e)) {
                                    return interfaceC4238e.mo344private().vip(c15816e);
                                }
                            } else if ((abstractC6126e.f27014e & 32) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                                int i = 0;
                                abstractC6126e = abstractC6126e;
                                r4 = r4;
                                while (abstractC13616e2 != null) {
                                    if ((abstractC13616e2.f27014e & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            abstractC6126e = abstractC13616e2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC6126e != 0) {
                                                r4.license(abstractC6126e);
                                                abstractC6126e = 0;
                                            }
                                            r4.license(abstractC13616e2);
                                        }
                                    }
                                    abstractC13616e2 = abstractC13616e2.f27024e;
                                    abstractC6126e = abstractC6126e;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC6126e = AbstractC5851e.vip(r4);
                        }
                    }
                    abstractC13616e = abstractC13616e.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
        return ((Function0) c15816e.f31190e).invoke();
    }

    @Override // defpackage.InterfaceC12415e
    public final void signatures(long j) {
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return ((InterfaceC16827e) this.f11884e).startapp(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC6505e
    /* renamed from: this */
    public final void mo578this(InterfaceC12296e interfaceC12296e) {
        InterfaceC8177e interfaceC8177e = this.f11884e;
        AbstractC14070e.metrica("applyFocusProperties called on wrong node");
        interfaceC8177e.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC13046e
    /* renamed from: throw */
    public final void mo1035throw(EnumC16488e enumC16488e) {
        InterfaceC8177e interfaceC8177e = this.f11884e;
        AbstractC14070e.metrica("onFocusEvent called on wrong node");
        interfaceC8177e.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.f11884e.toString();
    }

    @Override // defpackage.InterfaceC9629e
    /* renamed from: try */
    public final void mo721try(InterfaceC0043e interfaceC0043e) {
        ((AbstractC8704e) this.f11884e).mo2470try(interfaceC0043e);
    }

    @Override // defpackage.InterfaceC2961e
    public final InterfaceC14388e vip() {
        return AbstractC5851e.mopub(this).f27604e;
    }

    @Override // defpackage.InterfaceC2961e
    public final long yandex() {
        return AbstractC8116e.startapp(AbstractC5851e.yandex(this, 128).f6803e);
    }
}
