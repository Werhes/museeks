package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8648e implements InterfaceC5045e {
    public final int ad;
    public final Object metrica;
    public final InterfaceC7227e vip;

    public C8648e(int i, InterfaceC7227e interfaceC7227e, Object obj) {
        long charValue;
        this.ad = i;
        this.vip = interfaceC7227e;
        if (AbstractC5509e.ad[AbstractC8703e.m2467class(i)] == 1) {
            if (obj instanceof Number) {
                charValue = ((Number) obj).longValue();
            } else {
                if (!(obj instanceof Character)) {
                    throw new IllegalArgumentException("Unsupported numeric type. Only Long, Short, Int, Byte and Char are valid numeric types.");
                }
                charValue = ((Character) obj).charValue();
            }
            obj = Long.valueOf(charValue);
        }
        this.metrica = obj;
    }

    public final boolean ad() {
        return ((Boolean) advert(2)).booleanValue();
    }

    public final InterfaceC17159e adcel() {
        return (InterfaceC17159e) advert(10);
    }

    public final Object advert(int i) {
        int i2 = this.ad;
        if (i2 == i) {
            return this.metrica;
        }
        throw new IllegalStateException(AbstractC17861e.subscription("RealmAny type mismatch, wanted a '", AbstractC0054e.m222native(i), "' but the instance is a '", AbstractC0054e.m222native(i2), "'."));
    }

    public final float appmetrica() {
        return ((Float) advert(6)).floatValue();
    }

    public final C2453e billing() {
        return (C2453e) advert(9);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8648e)) {
            return false;
        }
        C8648e c8648e = (C8648e) obj;
        Object obj2 = c8648e.metrica;
        if (c8648e.ad != this.ad) {
            return false;
        }
        InterfaceC7227e vip = AbstractC3820e.ad.vip(byte[].class);
        InterfaceC7227e interfaceC7227e = this.vip;
        boolean billing = AbstractC7890e.billing(interfaceC7227e, vip);
        Object obj3 = this.metrica;
        if (billing) {
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) obj3);
            }
            return false;
        }
        if (!(obj3 instanceof InterfaceC17544e)) {
            return AbstractC7890e.billing(obj3, obj2);
        }
        if (AbstractC7890e.billing(c8648e.vip, interfaceC7227e)) {
            return AbstractC7890e.billing(obj2, obj3);
        }
        return false;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (AbstractC8703e.m2467class(this.ad) * 31)) * 31);
    }

    public final double license() {
        return ((Double) advert(7)).doubleValue();
    }

    public final C12355e metrica() {
        return (C12355e) advert(8);
    }

    public final String mopub() {
        return (String) advert(3);
    }

    public final long purchase() {
        return ((Long) advert(1)).longValue();
    }

    public final InterfaceC14287e startapp(InterfaceC7227e interfaceC7227e) {
        Object advert = advert(11);
        if (interfaceC7227e.applovin(advert)) {
            return (InterfaceC14287e) advert;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC7227e.license());
    }

    public final String toString() {
        String str;
        int i = this.ad;
        Object advert = advert(i);
        StringBuilder sb = new StringBuilder("RealmAny{type=");
        switch (i) {
            case 1:
                str = "INT";
                break;
            case 2:
                str = "BOOL";
                break;
            case 3:
                str = "STRING";
                break;
            case 4:
                str = "BINARY";
                break;
            case 5:
                str = "TIMESTAMP";
                break;
            case 6:
                str = "FLOAT";
                break;
            case 7:
                str = "DOUBLE";
                break;
            case 8:
                str = "DECIMAL128";
                break;
            case 9:
                str = "OBJECT_ID";
                break;
            case 10:
                str = "UUID";
                break;
            case 11:
                str = "OBJECT";
                break;
            case 12:
                str = "LIST";
                break;
            case 13:
                str = "DICTIONARY";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", value=");
        sb.append(advert);
        sb.append("}");
        return sb.toString();
    }

    public final byte[] vip() {
        return (byte[]) advert(4);
    }

    public final InterfaceC6025e yandex() {
        return (InterfaceC6025e) advert(5);
    }
}
