package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14957e extends AbstractC16946e implements InterfaceC16528e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C8268e f29654e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f29655e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C16169e f29656e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f29657e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f29658e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f29659e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public Map f29660e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f29661e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f29662e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f29663e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public InterfaceC16528e f29664e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public AbstractC1186e f29665e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public volatile C12056e f29666e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final InterfaceC16528e f29667e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C16169e f29668e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public Collection f29669e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f29670e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final int f29671e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f29672e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f29673e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f29674e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public boolean f29675e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f29676e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f29677e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f29678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC14957e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        super(interfaceC15498e, interfaceC2460e, c0520e, interfaceC3054e);
        if (interfaceC15498e == null) {
            m3891e(0);
            throw null;
        }
        if (interfaceC2460e == null) {
            m3891e(1);
            throw null;
        }
        if (c0520e == null) {
            m3891e(2);
            throw null;
        }
        if (i == 0) {
            m3891e(3);
            throw null;
        }
        if (interfaceC3054e == null) {
            m3891e(4);
            throw null;
        }
        this.f29654e = AbstractC6050e.startapp;
        this.f29658e = false;
        this.f29662e = false;
        this.f29663e = false;
        this.f29661e = false;
        this.f29659e = false;
        this.f29672e = false;
        this.f29678e = false;
        this.f29657e = false;
        this.f29670e = false;
        this.f29673e = true;
        this.f29675e = false;
        this.f29669e = null;
        this.f29666e = null;
        this.f29664e = null;
        this.f29660e = null;
        this.f29667e = interfaceC16528e == null ? this : interfaceC16528e;
        this.f29671e = i;
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public static ArrayList m3890e(InterfaceC16528e interfaceC16528e, List list, C4542e c4542e, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            m3891e(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13043e c13043e = (C13043e) it.next();
            C13043e c13043e2 = c13043e;
            AbstractC1186e startapp = c4542e.startapp(2, c13043e2.ad());
            AbstractC1186e abstractC1186e = c13043e.f25971e;
            AbstractC1186e startapp2 = abstractC1186e == null ? null : c4542e.startapp(2, abstractC1186e);
            if (startapp == null) {
                return null;
            }
            if ((startapp != c13043e2.ad() || abstractC1186e != startapp2) && zArr != null) {
                zArr[0] = true;
            }
            C3411e c3411e = c13043e instanceof C8553e ? new C3411e(21, (List) ((C8553e) c13043e).f17373e.getValue()) : null;
            C13043e c13043e3 = z ? null : c13043e;
            int i = c13043e.f25973e;
            InterfaceC2460e annotations = c13043e.getAnnotations();
            C0520e name = c13043e.getName();
            boolean m3525e = c13043e.m3525e();
            boolean z3 = c13043e.f25972e;
            boolean z4 = c13043e.f25969e;
            InterfaceC3054e adcel = z2 ? c13043e.adcel() : InterfaceC3054e.f7112e;
            arrayList.add(c3411e == null ? new C13043e(interfaceC16528e, c13043e3, i, annotations, name, startapp, m3525e, z3, z4, startapp2, adcel) : new C8553e(interfaceC16528e, c13043e3, i, annotations, name, startapp, m3525e, z3, z4, startapp2, adcel, c3411e));
        }
        return arrayList;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m3891e(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 31:
                objArr[0] = "substitutor";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[1] = "copy";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.InterfaceC0091e
    public final C8268e advert() {
        C8268e c8268e = this.f29654e;
        if (c8268e != null) {
            return c8268e;
        }
        m3891e(16);
        throw null;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        int i = this.f29655e;
        if (i != 0) {
            return i;
        }
        m3891e(15);
        throw null;
    }

    /* renamed from: eّؑۛ */
    public abstract AbstractC14957e mo361e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e);

    /* renamed from: eۣؑۡ */
    public Object mo830e(C15378e c15378e) {
        Map map = this.f29660e;
        if (map == null) {
            return null;
        }
        return map.get(c15378e);
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eؔٚۚ, reason: contains not printable characters */
    public final boolean mo3892e() {
        return this.f29678e;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؕؓٗ */
    public final List mo2242e() {
        List list = this.f29674e;
        if (list != null) {
            return list;
        }
        m3891e(13);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؕؗؑ */
    public final C16169e mo327e() {
        return this.f29656e;
    }

    /* renamed from: eٖؗۘ */
    public AbstractC14957e mo2772e(C15704e c15704e) {
        InterfaceC2460e annotations;
        ArrayList arrayList;
        C16169e c16169e;
        AbstractC14957e abstractC14957e;
        ArrayList arrayList2;
        C16169e c16169e2;
        AbstractC1186e startapp;
        boolean[] zArr = new boolean[1];
        boolean z = false;
        if (c15704e.f30939e != null) {
            annotations = getAnnotations();
            InterfaceC2460e interfaceC2460e = c15704e.f30939e;
            if (annotations.isEmpty()) {
                annotations = interfaceC2460e;
            } else if (!interfaceC2460e.isEmpty()) {
                annotations = new C4155e(new InterfaceC2460e[]{annotations, interfaceC2460e});
            }
        } else {
            annotations = getAnnotations();
        }
        InterfaceC2460e interfaceC2460e2 = annotations;
        InterfaceC15498e interfaceC15498e = c15704e.f30932e;
        InterfaceC16528e interfaceC16528e = c15704e.f30924e;
        int i = c15704e.f30946e;
        C0520e c0520e = c15704e.f30926e;
        InterfaceC3054e adcel = c15704e.f30934e ? ((AbstractC16946e) (interfaceC16528e != null ? interfaceC16528e : vip())).adcel() : InterfaceC3054e.f7112e;
        if (adcel == null) {
            m3891e(27);
            throw null;
        }
        AbstractC14957e mo361e = mo361e(i, interfaceC2460e2, interfaceC15498e, interfaceC16528e, c0520e, adcel);
        List list = c15704e.f30931e;
        if (list == null) {
            list = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList3 = new ArrayList(list.size());
        C4542e purchase = AbstractC9460e.purchase(list, c15704e.f30944e, mo361e, arrayList3, zArr);
        if (purchase != null) {
            ArrayList arrayList4 = new ArrayList();
            if (!c15704e.f30936e.isEmpty()) {
                int i2 = 0;
                for (C16169e c16169e3 : c15704e.f30936e) {
                    AbstractC1186e startapp2 = purchase.startapp(2, c16169e3.ad());
                    if (startapp2 != null) {
                        int i3 = i2 + 1;
                        arrayList4.add(AbstractC7518e.vip(mo361e, startapp2, ((C12990e) c16169e3.m4142e()).m3522e(), c16169e3.getAnnotations(), i2));
                        zArr[0] = zArr[0] | (startapp2 != c16169e3.ad());
                        i2 = i3;
                    }
                }
            }
            C16169e c16169e4 = c15704e.f30942e;
            if (c16169e4 != null) {
                AbstractC1186e startapp3 = purchase.startapp(2, c16169e4.ad());
                if (startapp3 != null) {
                    c15704e.f30942e.m4142e();
                    C16169e c16169e5 = new C16169e(mo361e, new C13914e(mo361e, startapp3), c15704e.f30942e.getAnnotations());
                    zArr[0] = (startapp3 != c15704e.f30942e.ad()) | zArr[0];
                    arrayList = arrayList3;
                    c16169e = c16169e5;
                }
                return null;
            }
            arrayList = arrayList3;
            c16169e = null;
            C16169e c16169e6 = c15704e.f30928e;
            if (c16169e6 != null) {
                C16169e remoteconfig = c16169e6.remoteconfig(purchase);
                if (remoteconfig != null) {
                    zArr[0] = zArr[0] | (remoteconfig != c15704e.f30928e);
                    abstractC14957e = null;
                    arrayList2 = arrayList4;
                    c16169e2 = remoteconfig;
                }
                return null;
            }
            abstractC14957e = null;
            arrayList2 = arrayList4;
            c16169e2 = null;
            ArrayList m3890e = m3890e(mo361e, c15704e.f30945e, purchase, c15704e.f30935e, c15704e.f30934e, zArr);
            if (m3890e == null || (startapp = purchase.startapp(3, c15704e.f30937e)) == null) {
                return abstractC14957e;
            }
            boolean z2 = zArr[0] | (startapp != c15704e.f30937e);
            zArr[0] = z2;
            if (!z2 && c15704e.f30941e) {
                return this;
            }
            mo361e.mo470e(c16169e, c16169e2, arrayList2, arrayList, m3890e, startapp, c15704e.f30927e, c15704e.f30940e);
            mo361e.f29658e = this.f29658e;
            mo361e.f29662e = this.f29662e;
            mo361e.f29663e = this.f29663e;
            mo361e.f29661e = this.f29661e;
            mo361e.f29659e = this.f29659e;
            mo361e.f29670e = this.f29670e;
            mo361e.f29672e = this.f29672e;
            mo361e.mo2906e(this.f29673e);
            mo361e.f29678e = c15704e.f30933e;
            mo361e.f29657e = c15704e.f30947e;
            Boolean bool = c15704e.f30938e;
            mo361e.mo2907e(bool != null ? bool.booleanValue() : this.f29675e);
            if (!c15704e.f30929e.isEmpty() || this.f29660e != null) {
                LinkedHashMap linkedHashMap = c15704e.f30929e;
                Map map = this.f29660e;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.size() == 1) {
                    mo361e.f29660e = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                } else {
                    mo361e.f29660e = linkedHashMap;
                }
            }
            if (c15704e.f30930e || this.f29664e != null) {
                InterfaceC16528e interfaceC16528e2 = this.f29664e;
                if (interfaceC16528e2 == null) {
                    interfaceC16528e2 = this;
                }
                mo361e.f29664e = interfaceC16528e2.remoteconfig(purchase);
            }
            if (c15704e.f30925e && !vip().mo337finally().isEmpty()) {
                if (c15704e.f30944e.appmetrica()) {
                    C12056e c12056e = this.f29666e;
                    if (c12056e != null) {
                        mo361e.f29666e = c12056e;
                        return mo361e;
                    }
                    mo361e.mo336e(mo337finally());
                    return mo361e;
                }
                mo361e.f29666e = new C12056e(this, purchase, z, 18);
            }
            return mo361e;
        }
        return null;
    }

    /* renamed from: eؘؗؕ */
    public boolean mo328e() {
        return this.f29675e;
    }

    /* renamed from: eؘۗٚ */
    public boolean mo464e() {
        return this.f29659e;
    }

    /* renamed from: eؙٚؑ */
    public void mo470e(C16169e c16169e, C16169e c16169e2, List list, List list2, List list3, AbstractC1186e abstractC1186e, int i, C8268e c8268e) {
        if (list == null) {
            m3891e(5);
            throw null;
        }
        if (list2 == null) {
            m3891e(6);
            throw null;
        }
        if (list3 == null) {
            m3891e(7);
            throw null;
        }
        if (c8268e == null) {
            m3891e(8);
            throw null;
        }
        this.f29677e = AbstractC13480e.m3575continue(list2);
        this.f29676e = AbstractC13480e.m3575continue(list3);
        this.f29665e = abstractC1186e;
        this.f29655e = i;
        this.f29654e = c8268e;
        this.f29656e = c16169e;
        this.f29668e = c16169e2;
        this.f29674e = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC16046e interfaceC16046e = (InterfaceC16046e) list2.get(i2);
            if (interfaceC16046e.getIndex() != i2) {
                throw new IllegalStateException(interfaceC16046e + " index is " + interfaceC16046e.getIndex() + " but position is " + i2);
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            C13043e c13043e = (C13043e) list3.get(i3);
            if (c13043e.f25973e != i3) {
                throw new IllegalStateException(c13043e + "index is " + c13043e.f25973e + " but position is " + i3);
            }
        }
    }

    /* renamed from: eؚؒؖ */
    public InterfaceC16733e mo471e() {
        return m3897e(C4542e.vip);
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eٌٕۗ */
    public final boolean mo1941e() {
        return false;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eُٚۜ, reason: contains not printable characters */
    public final boolean mo3893e() {
        return this.f29657e;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eُِؕ */
    public final boolean mo1942e() {
        return this.f29672e;
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final void m3894e(AbstractC10226e abstractC10226e) {
        if (abstractC10226e != null) {
            this.f29665e = abstractC10226e;
        } else {
            m3891e(11);
            throw null;
        }
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final void m3895e(C15378e c15378e, Object obj) {
        if (this.f29660e == null) {
            this.f29660e = new LinkedHashMap();
        }
        this.f29660e.put(c15378e, obj);
    }

    @Override // defpackage.InterfaceC0390e
    /* renamed from: eّؓٙ */
    public final int mo334e() {
        int i = this.f29671e;
        if (i != 0) {
            return i;
        }
        m3891e(21);
        throw null;
    }

    /* renamed from: eؚؚْ */
    public void mo2906e(boolean z) {
        this.f29673e = z;
    }

    /* renamed from: eْٗۚ */
    public boolean mo466e() {
        return this.f29663e;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eؙٖؐ, reason: contains not printable characters */
    public final InterfaceC16528e mo3896e() {
        return this.f29664e;
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final C15704e m3897e(C4542e c4542e) {
        if (c4542e != null) {
            return new C15704e(this, c4542e.purchase(), mo1351switch(), mo1718extends(), advert(), mo334e(), mo330e(), mo2242e(), this.f29656e, inmobi());
        }
        m3891e(24);
        throw null;
    }

    @Override // defpackage.InterfaceC0390e
    /* renamed from: eٖٕٚ, reason: merged with bridge method [inline-methods] */
    public C1117e mo335e(InterfaceC15498e interfaceC15498e, int i, C8268e c8268e) {
        return (C1117e) m3898e(interfaceC15498e, i, c8268e);
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final InterfaceC16528e m3898e(InterfaceC15498e interfaceC15498e, int i, C8268e c8268e) {
        InterfaceC16528e build = mo471e().tapsense(interfaceC15498e).isPro(i).Signature(c8268e).metrica(2).admob().build();
        if (build != null) {
            return build;
        }
        m3891e(26);
        throw null;
    }

    /* renamed from: eؙّٗ */
    public void mo336e(Collection collection) {
        if (collection == null) {
            m3891e(17);
            throw null;
        }
        this.f29669e = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC16528e) it.next()).mo3893e()) {
                this.f29657e = true;
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final boolean mo3899e() {
        if (this.f29662e) {
            return true;
        }
        Iterator it = vip().mo337finally().iterator();
        while (it.hasNext()) {
            if (((InterfaceC16528e) it.next()).mo3899e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eٌٗۙ */
    public final C16169e mo329e() {
        return this.f29668e;
    }

    /* renamed from: eؘٟ٘ */
    public Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.ads(this, obj);
    }

    /* renamed from: eًٜ٘ */
    public void mo2907e(boolean z) {
        this.f29675e = z;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: e٘ۚۧ */
    public final List mo330e() {
        List list = this.f29676e;
        if (list != null) {
            return list;
        }
        m3891e(19);
        throw null;
    }

    /* renamed from: finally */
    public Collection mo337finally() {
        C12056e c12056e = this.f29666e;
        if (c12056e != null) {
            this.f29669e = (Collection) c12056e.invoke();
            this.f29666e = null;
        }
        Collection collection = this.f29669e;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m3891e(14);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    public final List getTypeParameters() {
        List list = this.f29677e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public AbstractC1186e inmobi() {
        return this.f29665e;
    }

    @Override // defpackage.InterfaceC7681e
    public InterfaceC16528e remoteconfig(C4542e c4542e) {
        if (c4542e == null) {
            m3891e(22);
            throw null;
        }
        if (c4542e.ad.appmetrica()) {
            return this;
        }
        C15704e m3897e = m3897e(c4542e);
        m3897e.f30924e = vip();
        m3897e.f30934e = true;
        m3897e.f30941e = true;
        return m3897e.f30943e.mo2772e(m3897e);
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: return, reason: not valid java name */
    public final boolean mo3900return() {
        if (this.f29658e) {
            return true;
        }
        Iterator it = vip().mo337finally().iterator();
        while (it.hasNext()) {
            if (((InterfaceC16528e) it.next()).mo3900return()) {
                return true;
            }
        }
        return false;
    }

    public boolean tapsense() {
        return this.f29670e;
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    public InterfaceC16528e vip() {
        InterfaceC16528e interfaceC16528e = this.f29667e;
        InterfaceC16528e vip = interfaceC16528e == this ? this : interfaceC16528e.vip();
        if (vip != null) {
            return vip;
        }
        m3891e(20);
        throw null;
    }

    public boolean yandex() {
        return this.f29661e;
    }
}
