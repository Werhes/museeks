package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14985e implements InterfaceC1425e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C1410e f29698e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LinkedHashMap f29699e = new LinkedHashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f29700e = false;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        f29698e = C1410e.f4222e;
    }

    public final ArrayList Signature() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f29699e.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add((InterfaceC3589e) it2.next());
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC9354e
    public final Iterator adcel() {
        return new C5414e(this.f29699e.entrySet().iterator());
    }

    public final List admob(String str) {
        List list = (List) this.f29699e.get(str);
        return list == null ? f29698e : list;
    }

    @Override // defpackage.InterfaceC9354e
    public boolean billing(EnumC8271e enumC8271e) {
        return admob(enumC8271e.name()).size() != 0;
    }

    @Override // defpackage.InterfaceC9354e
    public boolean isEmpty() {
        return this.f29699e.size() == 0;
    }

    @Override // defpackage.InterfaceC9354e
    public final int license() {
        Signature().size();
        Iterator adcel = adcel();
        int i = 0;
        while (true) {
            C5414e c5414e = (C5414e) adcel;
            if (!c5414e.hasNext()) {
                return i;
            }
            i++;
            c5414e.next();
        }
    }

    @Override // defpackage.InterfaceC9354e
    public InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        AbstractC5542e.license(abstractC13977e, "artwork");
        smaato(advert(abstractC13977e));
        return this;
    }

    @Override // defpackage.InterfaceC9354e
    public AbstractC17475e metrica(EnumC8271e enumC8271e) {
        return AbstractC17475e.remoteconfig(admob("COVER_ART"));
    }

    @Override // defpackage.InterfaceC9354e
    public InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        smaato(ad(enumC8271e, strArr));
        return this;
    }

    public void purchase(InterfaceC3589e interfaceC3589e) {
        if (interfaceC3589e == null) {
            return;
        }
        String id = interfaceC3589e.getId();
        LinkedHashMap linkedHashMap = this.f29699e;
        List list = (List) linkedHashMap.get(id);
        if (list != null) {
            list.add(interfaceC3589e);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC3589e);
        linkedHashMap.put(interfaceC3589e.getId(), arrayList);
        interfaceC3589e.Signature();
    }

    public final AbstractC9621e remoteconfig(String str) {
        List admob = admob(str);
        return admob.size() > 0 ? AbstractC9621e.license(((InterfaceC3589e) admob.get(0)).toString()) : C1444e.f4274e;
    }

    @Override // defpackage.InterfaceC1425e
    public void smaato(InterfaceC3589e interfaceC3589e) {
        if (interfaceC3589e == null) {
            return;
        }
        String id = interfaceC3589e.getId();
        LinkedHashMap linkedHashMap = this.f29699e;
        List list = (List) linkedHashMap.get(id);
        if (list != null) {
            list.set(0, interfaceC3589e);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC3589e);
        linkedHashMap.put(interfaceC3589e.getId(), arrayList);
        interfaceC3589e.Signature();
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e startapp(EnumC8271e enumC8271e) {
        return appmetrica(enumC8271e);
    }

    public final AbstractC17475e subscription(String str) {
        List list = (List) this.f29699e.get(str);
        return list == null ? C1410e.f4222e : AbstractC17475e.remoteconfig(list);
    }

    public String toString() {
        StringBuilder inmobi = AbstractC8703e.inmobi("Tag content:\n");
        Iterator adcel = adcel();
        while (true) {
            C5414e c5414e = (C5414e) adcel;
            if (!c5414e.hasNext()) {
                return inmobi.toString().substring(0, inmobi.length() - 1);
            }
            InterfaceC3589e interfaceC3589e = (InterfaceC3589e) c5414e.next();
            inmobi.append("\t");
            inmobi.append(interfaceC3589e.getId());
            inmobi.append(":");
            inmobi.append(interfaceC3589e.toString());
            inmobi.append("\n");
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean vip() {
        return this.f29700e;
    }

    public final InterfaceC9354e yandex(String str) {
        if (str == null || AbstractC8433e.license(str)) {
            throw new IllegalArgumentException("id cannot be null or the empty string");
        }
        this.f29699e.remove(str);
        return this;
    }
}
