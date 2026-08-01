package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7878e extends AbstractC16232e {
    public final int ad;
    public final AbstractC1186e vip;

    public C7878e(int i, AbstractC1186e abstractC1186e) {
        if (i == 0) {
            appmetrica(0);
            throw null;
        }
        if (abstractC1186e == null) {
            appmetrica(1);
            throw null;
        }
        this.ad = i;
        this.vip = abstractC1186e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7878e(AbstractC1186e abstractC1186e) {
        this(1, abstractC1186e);
        if (abstractC1186e != null) {
        } else {
            appmetrica(2);
            throw null;
        }
    }

    public static /* synthetic */ void appmetrica(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.AbstractC16232e
    public final int ad() {
        int i = this.ad;
        if (i != 0) {
            return i;
        }
        appmetrica(4);
        throw null;
    }

    @Override // defpackage.AbstractC16232e
    public final AbstractC16232e license(C13520e c13520e) {
        if (c13520e != null) {
            return new C7878e(this.ad, this.vip);
        }
        appmetrica(6);
        throw null;
    }

    @Override // defpackage.AbstractC16232e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.AbstractC16232e
    public final AbstractC1186e vip() {
        AbstractC1186e abstractC1186e = this.vip;
        if (abstractC1186e != null) {
            return abstractC1186e;
        }
        appmetrica(5);
        throw null;
    }
}
