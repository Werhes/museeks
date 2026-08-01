package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۤؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1428e extends AbstractC17288e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f4258e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ArrayList f4259e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1428e(defpackage.InterfaceC15498e r11, defpackage.InterfaceC2460e r12, boolean r13, int r14, defpackage.C0520e r15, int r16, defpackage.InterfaceC11542e r17) {
        /*
            r10 = this;
            eٍؗۘ r8 = defpackage.C5107e.f10959e
            r9 = 0
            if (r11 == 0) goto L3e
            if (r12 == 0) goto L38
            if (r14 == 0) goto L32
            if (r15 == 0) goto L2c
            if (r17 == 0) goto L26
            r0 = r10
            r2 = r11
            r3 = r12
            r6 = r13
            r5 = r14
            r4 = r15
            r7 = r16
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 1
            r11.<init>(r12)
            r10.f4259e = r11
            r11 = 0
            r10.f4258e = r11
            return
        L26:
            r11 = 25
            m607e(r11)
            throw r9
        L2c:
            r11 = 22
            m607e(r11)
            throw r9
        L32:
            r11 = 21
            m607e(r11)
            throw r9
        L38:
            r11 = 20
            m607e(r11)
            throw r9
        L3e:
            r11 = 19
            m607e(r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1428e.<init>(eِٕٖ, eٌؔٚ, boolean, int, eؑۘٛ, int, eِْؗ):void");
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public static C1428e m605e(InterfaceC15498e interfaceC15498e, InterfaceC2460e interfaceC2460e, boolean z, int i, C0520e c0520e, int i2, InterfaceC11542e interfaceC11542e) {
        if (interfaceC15498e == null) {
            m607e(6);
            throw null;
        }
        if (interfaceC2460e == null) {
            m607e(7);
            throw null;
        }
        if (i == 0) {
            m607e(8);
            throw null;
        }
        if (c0520e == null) {
            m607e(9);
            throw null;
        }
        if (interfaceC11542e == null) {
            m607e(11);
            throw null;
        }
        if (i != 0) {
            return new C1428e(interfaceC15498e, interfaceC2460e, z, i, c0520e, i2, interfaceC11542e);
        }
        m607e(14);
        throw null;
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public static C1428e m606e(AbstractC15349e abstractC15349e, int i, C0520e c0520e, int i2, InterfaceC11542e interfaceC11542e) {
        C11064e c11064e = C4590e.f9885e;
        if (i == 0) {
            m607e(2);
            throw null;
        }
        if (interfaceC11542e == null) {
            m607e(4);
            throw null;
        }
        C1428e m605e = m605e(abstractC15349e, c11064e, false, i, c0520e, i2, interfaceC11542e);
        AbstractC10226e loadAd = AbstractC2876e.appmetrica(abstractC15349e).loadAd();
        if (m605e.f4258e) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m605e.m608e());
        }
        if (!AbstractC4520e.purchase(loadAd)) {
            m605e.f4259e.add(loadAd);
        }
        if (!m605e.f4258e) {
            m605e.f4258e = true;
            return m605e;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + m605e.m608e());
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m607e(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "bound";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "<init>";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final String m608e() {
        return getName() + " declared in " + AbstractC14300e.purchase(mo1351switch());
    }

    @Override // defpackage.AbstractC17288e
    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final List mo609e() {
        if (!this.f4258e) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m608e());
        }
        ArrayList arrayList = this.f4259e;
        if (arrayList != null) {
            return arrayList;
        }
        m607e(28);
        throw null;
    }
}
