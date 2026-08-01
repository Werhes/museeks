package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6722e implements InterfaceC14209e, InterfaceC7445e {
    public final boolean ad = true;
    public final InterfaceC1848e appmetrica;
    public final Map license;
    public final Map metrica;
    public final boolean purchase;
    public final JsonWriter vip;

    public C6722e(Writer writer, Map map, Map map2, InterfaceC1848e interfaceC1848e, boolean z) {
        this.vip = new JsonWriter(writer);
        this.metrica = map;
        this.license = map2;
        this.appmetrica = interfaceC1848e;
        this.purchase = z;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e ad(C7369e c7369e, Object obj) {
        startapp(obj, c7369e.ad);
        return this;
    }

    public final void adcel() {
        if (!this.ad) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e appmetrica(C7369e c7369e, int i) {
        String str = c7369e.ad;
        adcel();
        JsonWriter jsonWriter = this.vip;
        jsonWriter.name(str);
        adcel();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e billing(C7369e c7369e, long j) {
        String str = c7369e.ad;
        adcel();
        JsonWriter jsonWriter = this.vip;
        jsonWriter.name(str);
        adcel();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e license(C7369e c7369e, boolean z) {
        String str = c7369e.ad;
        adcel();
        JsonWriter jsonWriter = this.vip;
        jsonWriter.name(str);
        adcel();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC7445e
    public final InterfaceC7445e metrica(boolean z) {
        adcel();
        this.vip.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC14209e
    public final InterfaceC14209e purchase(C7369e c7369e, double d) {
        String str = c7369e.ad;
        adcel();
        JsonWriter jsonWriter = this.vip;
        jsonWriter.name(str);
        adcel();
        jsonWriter.value(d);
        return this;
    }

    public final C6722e startapp(Object obj, String str) {
        boolean z = this.purchase;
        JsonWriter jsonWriter = this.vip;
        if (z) {
            if (obj == null) {
                return this;
            }
            adcel();
            jsonWriter.name(str);
            yandex(obj);
            return this;
        }
        adcel();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        yandex(obj);
        return this;
    }

    @Override // defpackage.InterfaceC7445e
    public final InterfaceC7445e vip(String str) {
        adcel();
        this.vip.value(str);
        return this;
    }

    public final C6722e yandex(Object obj) {
        JsonWriter jsonWriter = this.vip;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    yandex(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        startapp(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1848e interfaceC1848e = (InterfaceC1848e) this.metrica.get(obj.getClass());
            if (interfaceC1848e != null) {
                jsonWriter.beginObject();
                interfaceC1848e.ad(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC18171e interfaceC18171e = (InterfaceC18171e) this.license.get(obj.getClass());
            if (interfaceC18171e != null) {
                interfaceC18171e.ad(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.appmetrica.ad(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof InterfaceC3070e) {
                int ad = ((InterfaceC3070e) obj).ad();
                adcel();
                jsonWriter.value(ad);
                return this;
            }
            String name = ((Enum) obj).name();
            adcel();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            adcel();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r7[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                adcel();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                yandex(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                yandex(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }
}
