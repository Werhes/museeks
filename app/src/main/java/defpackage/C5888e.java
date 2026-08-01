package defpackage;

import androidx.car.app.model.Alert;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5888e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12434e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f12435e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f12436e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f12437e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12438e;

    public /* synthetic */ C5888e(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f12438e = i2;
        this.f12435e = obj;
        this.f12437e = obj2;
        this.f12434e = obj3;
        this.f12436e = i;
    }

    public /* synthetic */ C5888e(C9556e c9556e, int i, Map map, C15816e c15816e) {
        this.f12438e = 2;
        this.f12435e = c9556e;
        this.f12436e = i;
        this.f12437e = map;
        this.f12434e = c15816e;
    }

    public /* synthetic */ C5888e(AbstractC2832e[] abstractC2832eArr, C8587e c8587e, int i, int[] iArr) {
        this.f12438e = 3;
        this.f12435e = abstractC2832eArr;
        this.f12437e = c8587e;
        this.f12436e = i;
        this.f12434e = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f12438e;
        int i2 = 0;
        Object obj2 = this.f12434e;
        int i3 = this.f12436e;
        Object obj3 = this.f12437e;
        Object obj4 = this.f12435e;
        switch (i) {
            case 0:
                C9898e c9898e = (C9898e) obj3;
                C17866e c17866e = (C17866e) obj2;
                if (obj == ((C6656e) obj4)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof InterfaceC17335e) {
                    int i4 = c9898e.ad - i3;
                    int license = c17866e.license(obj);
                    c17866e.billing(Math.min(i4, license >= 0 ? c17866e.metrica[license] : Alert.DURATION_SHOW_INDEFINITELY), obj);
                }
                return Unit.INSTANCE;
            case 1:
                C10550e c10550e = (C10550e) obj4;
                InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj3;
                AbstractC2832e abstractC2832e = (AbstractC2832e) obj2;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                int i5 = c10550e.f20829e;
                C17210e c17210e = c10550e.f20831e;
                C2547e c2547e = c10550e.f20828e;
                C0866e c0866e = (C0866e) c10550e.f20830e.invoke();
                c17210e.ad(EnumC17426e.f34145e, AbstractC0173e.ad(abstractC3698e, i5, c2547e, c0866e != null ? c0866e.ad : null, interfaceC13158e.getLayoutDirection() == EnumC7792e.f15793e, abstractC2832e.f6806e), i3, abstractC2832e.f6806e);
                AbstractC3698e.advert(abstractC3698e, abstractC2832e, Math.round(-c17210e.ad.purchase()), 0);
                return Unit.INSTANCE;
            case 2:
                C9556e c9556e = (C9556e) obj4;
                Map map = (Map) obj3;
                C15816e c15816e = (C15816e) obj2;
                InterfaceC14287e startapp = ((C8648e) ((InterfaceC5045e) obj)).startapp(AbstractC3820e.ad.vip(InterfaceC16120e.class));
                C17974e c17974e = (C17974e) c9556e.f18968e;
                InterfaceC15348e interfaceC15348e = (InterfaceC15348e) c9556e.f18967e;
                if (startapp != null) {
                    C13655e f36702e = ((InterfaceC10518e) startapp).getF36702e();
                    if (f36702e == null) {
                        startapp = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), startapp, i3, map);
                    } else if (!AbstractC7890e.billing(f36702e.f27072e, interfaceC15348e)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    startapp = null;
                }
                C13655e f36702e2 = startapp != null ? ((InterfaceC10518e) startapp).getF36702e() : null;
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) c9556e.f18969e;
                realm_value_t m4012break = c15816e.m4012break(f36702e2);
                boolean[] zArr = new boolean[1];
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i6 = AbstractC6026e.ad;
                realmcJNI.realm_set_insert(ptr$cinterop_release, m4012break.ad, m4012break, new long[1], zArr);
                return Boolean.valueOf(zArr[0]);
            default:
                AbstractC2832e[] abstractC2832eArr = (AbstractC2832e[]) obj4;
                C8587e c8587e = (C8587e) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj;
                int length = abstractC2832eArr.length;
                int i7 = 0;
                while (i2 < length) {
                    AbstractC2832e abstractC2832e2 = abstractC2832eArr[i2];
                    int i8 = i7 + 1;
                    Object signatures = abstractC2832e2.signatures();
                    C11249e c11249e = signatures instanceof C11249e ? (C11249e) signatures : null;
                    AbstractC11750e abstractC11750e = c11249e != null ? c11249e.metrica : null;
                    abstractC3698e2.billing(abstractC2832e2, iArr[i7], abstractC11750e != null ? abstractC11750e.license(i3, abstractC2832e2.f6804e, EnumC7792e.f15794e) : c8587e.vip.ad(abstractC2832e2.f6804e, i3), 0.0f);
                    i2++;
                    i7 = i8;
                }
                return Unit.INSTANCE;
        }
    }
}
