package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8111e extends AbstractC15825e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Map f16470e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final EnumC8410e f16471e;

    static {
        EnumMap enumMap = new EnumMap(EnumC8410e.class);
        for (EnumC8410e enumC8410e : EnumC8410e.values()) {
            C8111e[] c8111eArr = new C8111e[10];
            for (int i = 0; i < 10; i++) {
                c8111eArr[i] = new C8111e(i, enumC8410e, C15794e.appmetrica);
            }
            enumMap.put((EnumMap) enumC8410e, (EnumC8410e) c8111eArr);
        }
        f16470e = DesugarCollections.unmodifiableMap(enumMap);
    }

    public C8111e(int i, EnumC8410e enumC8410e, C15794e c15794e) {
        super(c15794e, i);
        AbstractC9835e.advert(enumC8410e, "format char");
        this.f16471e = enumC8410e;
        if (c15794e.ad()) {
            return;
        }
        int i2 = enumC8410e.f17192e;
        i2 = c15794e.metrica() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        c15794e.license(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.AbstractC15825e
    /* renamed from: while */
    public final void mo474while(C0423e c0423e, Object obj) {
        c0423e.startapp(obj, this.f16471e, (C15794e) this.f31256e);
    }
}
