package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2917e implements InterfaceC14209e {
    public OutputStream ad;
    public final C12831e appmetrica = new C12831e(this, 1);
    public final InterfaceC1848e license;
    public final HashMap metrica;
    public final HashMap vip;
    public static final Charset purchase = Charset.forName("UTF-8");
    public static final C7369e billing = new C7369e("key", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(1))));
    public static final C7369e yandex = new C7369e("value", AbstractC10257e.Signature(AbstractC1414e.startapp(InterfaceC17050e.class, new C11173e(2))));
    public static final C11373e startapp = C11373e.vip;

    public C2917e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, InterfaceC1848e interfaceC1848e) {
        this.ad = byteArrayOutputStream;
        this.vip = hashMap;
        this.metrica = hashMap2;
        this.license = interfaceC1848e;
    }

    public static int startapp(C7369e c7369e) {
        InterfaceC17050e interfaceC17050e = (InterfaceC17050e) c7369e.vip(InterfaceC17050e.class);
        if (interfaceC17050e != null) {
            return ((C11173e) interfaceC17050e).vip;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e ad(C7369e c7369e, Object obj) {
        metrica(c7369e, obj, true);
        return this;
    }

    public final void adcel(InterfaceC1848e interfaceC1848e, C7369e c7369e, Object obj, boolean z) {
        C16644e c16644e = new C16644e(1);
        c16644e.f32665e = 0L;
        try {
            OutputStream outputStream = this.ad;
            this.ad = c16644e;
            try {
                interfaceC1848e.ad(obj, this);
                this.ad = outputStream;
                long j = c16644e.f32665e;
                c16644e.close();
                if (z && j == 0) {
                    return;
                }
                mopub((startapp(c7369e) << 3) | 2);
                advert(j);
                interfaceC1848e.ad(obj, this);
            } catch (Throwable th) {
                this.ad = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c16644e.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void advert(long j) {
        while (((-128) & j) != 0) {
            this.ad.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.ad.write(((int) j) & 127);
    }

    @Override // defpackage.InterfaceC14209e
    public final /* synthetic */ InterfaceC14209e appmetrica(C7369e c7369e, int i) {
        yandex(c7369e, i, true);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e billing(C7369e c7369e, long j) {
        if (j == 0) {
            return this;
        }
        InterfaceC17050e interfaceC17050e = (InterfaceC17050e) c7369e.vip(InterfaceC17050e.class);
        if (interfaceC17050e == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        mopub(((C11173e) interfaceC17050e).vip << 3);
        advert(j);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final /* synthetic */ InterfaceC14209e license(C7369e c7369e, boolean z) {
        yandex(c7369e, z ? 1 : 0, true);
        return this;
    }

    public final void metrica(C7369e c7369e, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            mopub((startapp(c7369e) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(purchase);
            mopub(bytes.length);
            this.ad.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                metrica(c7369e, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                adcel(startapp, c7369e, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            vip(c7369e, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            mopub((startapp(c7369e) << 3) | 5);
            this.ad.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            InterfaceC17050e interfaceC17050e = (InterfaceC17050e) c7369e.vip(InterfaceC17050e.class);
            if (interfaceC17050e == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            mopub(((C11173e) interfaceC17050e).vip << 3);
            advert(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            yandex(c7369e, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            mopub((startapp(c7369e) << 3) | 2);
            mopub(bArr.length);
            this.ad.write(bArr);
            return;
        }
        InterfaceC1848e interfaceC1848e = (InterfaceC1848e) this.vip.get(obj.getClass());
        if (interfaceC1848e != null) {
            adcel(interfaceC1848e, c7369e, obj, z);
            return;
        }
        InterfaceC18171e interfaceC18171e = (InterfaceC18171e) this.metrica.get(obj.getClass());
        if (interfaceC18171e != null) {
            C12831e c12831e = this.appmetrica;
            c12831e.vip = false;
            c12831e.license = c7369e;
            c12831e.metrica = z;
            interfaceC18171e.ad(obj, c12831e);
            return;
        }
        if (obj instanceof InterfaceC1823e) {
            yandex(c7369e, ((InterfaceC1823e) obj).ad(), true);
        } else if (obj instanceof Enum) {
            yandex(c7369e, ((Enum) obj).ordinal(), true);
        } else {
            adcel(this.license, c7369e, obj, z);
        }
    }

    public final void mopub(int i) {
        while ((i & (-128)) != 0) {
            this.ad.write((i & 127) | 128);
            i >>>= 7;
        }
        this.ad.write(i & 127);
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e purchase(C7369e c7369e, double d) {
        vip(c7369e, d, true);
        return this;
    }

    public final void vip(C7369e c7369e, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        mopub((startapp(c7369e) << 3) | 1);
        this.ad.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void yandex(C7369e c7369e, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC17050e interfaceC17050e = (InterfaceC17050e) c7369e.vip(InterfaceC17050e.class);
        if (interfaceC17050e == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        mopub(((C11173e) interfaceC17050e).vip << 3);
        mopub(i);
    }
}
