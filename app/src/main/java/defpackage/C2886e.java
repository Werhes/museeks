package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2886e extends AbstractC11661e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Collection f6860e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC17645e f6861e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final List f6862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2886e(AbstractC17645e abstractC17645e, List list, Collection collection, InterfaceC11542e interfaceC11542e) {
        super(interfaceC11542e);
        if (list == null) {
            yandex(1);
            throw null;
        }
        if (collection == null) {
            yandex(2);
            throw null;
        }
        if (interfaceC11542e == null) {
            yandex(3);
            throw null;
        }
        this.f6861e = abstractC17645e;
        this.f6862e = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f6860e = DesugarCollections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        List list = this.f6862e;
        if (list != null) {
            return list;
        }
        yandex(4);
        throw null;
    }

    @Override // defpackage.AbstractC13101e
    public final C5107e license() {
        return C5107e.f10959e;
    }

    @Override // defpackage.AbstractC11661e
    /* renamed from: startapp */
    public final InterfaceC5052e advert() {
        AbstractC17645e abstractC17645e = this.f6861e;
        if (abstractC17645e != null) {
            return abstractC17645e;
        }
        yandex(5);
        throw null;
    }

    public final String toString() {
        return AbstractC14300e.purchase(this.f6861e).ad;
    }

    @Override // defpackage.AbstractC13101e
    public final Collection vip() {
        Collection collection = this.f6860e;
        if (collection != null) {
            return collection;
        }
        yandex(6);
        throw null;
    }
}
