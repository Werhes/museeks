package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11946e extends AbstractC13101e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5107e f23926e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC17288e f23927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11946e(AbstractC17288e abstractC17288e, InterfaceC11542e interfaceC11542e, C5107e c5107e) {
        super(interfaceC11542e);
        if (interfaceC11542e == null) {
            yandex(0);
            throw null;
        }
        this.f23927e = abstractC17288e;
        this.f23926e = c5107e;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        AbstractC17288e abstractC17288e = this.f23927e;
        if (abstractC17288e != null) {
            return abstractC17288e;
        }
        yandex(3);
        throw null;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        AbstractC13270e appmetrica = AbstractC2876e.appmetrica(this.f23927e);
        if (appmetrica != null) {
            return appmetrica;
        }
        yandex(4);
        throw null;
    }

    @Override // defpackage.AbstractC13101e
    public final List billing(List list) {
        List mo2272e = this.f23927e.mo2272e(list);
        if (mo2272e != null) {
            return mo2272e;
        }
        yandex(8);
        throw null;
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        yandex(2);
        throw null;
    }

    @Override // defpackage.AbstractC13101e
    public final C5107e license() {
        C5107e c5107e = this.f23926e;
        if (c5107e != null) {
            return c5107e;
        }
        yandex(5);
        throw null;
    }

    @Override // defpackage.AbstractC13101e
    public final AbstractC1186e metrica() {
        return C18139e.vip(EnumC16799e.f32931e, new String[0]);
    }

    @Override // defpackage.AbstractC13101e
    public final boolean purchase(InterfaceC4077e interfaceC4077e) {
        if (!(interfaceC4077e instanceof InterfaceC16046e)) {
            return false;
        }
        return C5438e.f11673e.loadAd(this.f23927e, (InterfaceC16046e) interfaceC4077e, true, C5983e.f12619e);
    }

    public final String toString() {
        return this.f23927e.getName().f2667e;
    }

    @Override // defpackage.AbstractC13101e
    public final Collection vip() {
        List mo609e = this.f23927e.mo609e();
        if (mo609e != null) {
            return mo609e;
        }
        yandex(1);
        throw null;
    }
}
