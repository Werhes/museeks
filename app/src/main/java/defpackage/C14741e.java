package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14741e extends AbstractC8441e {
    public final /* synthetic */ int ad;
    public static final C14741e vip = new C14741e(0);
    public static final C14741e metrica = new C14741e(1);
    public static final C14741e license = new C14741e(2);
    public static final C14741e appmetrica = new C14741e(3);

    public /* synthetic */ C14741e(int i) {
        this.ad = i;
    }

    @Override // defpackage.AbstractC8441e
    public final /* bridge */ /* synthetic */ Object ad(Object obj) {
        switch (this.ad) {
            case 0:
                if (((Byte) obj) != null) {
                    return Long.valueOf(r3.byteValue());
                }
                return null;
            case 1:
                if (((Character) obj) != null) {
                    return Long.valueOf(r3.charValue());
                }
                return null;
            case 2:
                if (((Integer) obj) != null) {
                    return Long.valueOf(r3.intValue());
                }
                return null;
            default:
                if (((Short) obj) != null) {
                    return Long.valueOf(r3.shortValue());
                }
                return null;
        }
    }

    @Override // defpackage.AbstractC8441e
    public final /* bridge */ /* synthetic */ Object appmetrica(Object obj) {
        switch (this.ad) {
            case 0:
                if (((Long) obj) != null) {
                    return Byte.valueOf((byte) r3.longValue());
                }
                return null;
            case 1:
                if (((Long) obj) != null) {
                    return Character.valueOf((char) r3.longValue());
                }
                return null;
            case 2:
                Long l = (Long) obj;
                if (l != null) {
                    return Integer.valueOf((int) l.longValue());
                }
                return null;
            default:
                if (((Long) obj) != null) {
                    return Short.valueOf((short) r3.longValue());
                }
                return null;
        }
    }

    @Override // defpackage.AbstractC8441e
    public final realm_value_t purchase(C15816e c15816e, Object obj) {
        switch (this.ad) {
            case 0:
                return c15816e.m4025while((Long) obj);
            case 1:
                return c15816e.m4025while((Long) obj);
            case 2:
                return c15816e.m4025while((Long) obj);
            default:
                return c15816e.m4025while((Long) obj);
        }
    }

    @Override // defpackage.AbstractC8441e
    public final Object vip(realm_value_t realm_value_tVar) {
        switch (this.ad) {
            case 0:
                return AbstractC13501e.ad(realm_value_tVar);
            case 1:
                return AbstractC13501e.ad(realm_value_tVar);
            case 2:
                return AbstractC13501e.ad(realm_value_tVar);
            default:
                return AbstractC13501e.ad(realm_value_tVar);
        }
    }
}
