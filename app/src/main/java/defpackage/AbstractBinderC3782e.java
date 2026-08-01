package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3782e extends Binder implements IInterface {
    public final /* synthetic */ int metrica;

    public AbstractBinderC3782e(String str, int i) {
        this.metrica = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                return;
            case 3:
                attachInterface(this, str);
                return;
            case 4:
            default:
                attachInterface(this, str);
                return;
            case 5:
                attachInterface(this, str);
                return;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.metrica;
        return this;
    }

    /* renamed from: eؚؑ۟, reason: contains not printable characters */
    public abstract boolean mo1402e(int i, Parcel parcel, Parcel parcel2);

    /* renamed from: eًٖٕ */
    public abstract boolean mo687e(Parcel parcel, int i);

    /* renamed from: eٍۡ */
    public boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        switch (this.metrica) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.ytkab0bp.vkmusic.IVKExternalMusic");
                }
                if (i == 1598968902) {
                    parcel2.writeString("ru.ytkab0bp.vkmusic.IVKExternalMusic");
                    return true;
                }
                int i3 = 3;
                int i4 = 0;
                switch (i) {
                    case 2:
                        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                        int readInt = parcel.readInt();
                        if (((BinderC18041e) this).license.vip.startapp()) {
                            if (createStringArrayList.isEmpty()) {
                                Unit unit = Unit.INSTANCE;
                            } else {
                                VKXApplication vKXApplication = VKXApplication.f36528e;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                AbstractC5336e.purchase(vKXApplication, null, 0, new C0897e(createStringArrayList, readInt, "other", null), 3);
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        if (((BinderC18041e) this).license.vip.startapp()) {
                            C14027e.ad.getClass();
                            i4 = (int) C14027e.metrica();
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i4);
                        return true;
                    case 4:
                        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                        BinderC18041e binderC18041e = (BinderC18041e) this;
                        VKXApplication.Companion companion = VKXApplication.f36531e;
                        if (VKXApplication.Companion.metrica()) {
                            C2464e c2464e = C2464e.appmetrica;
                            C10053e c10053e = binderC18041e.license;
                            PackageManager packageManager = (PackageManager) c10053e.vip.f20360e;
                            String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
                            String obj = (packagesForUid == null || (str = packagesForUid[0]) == null) ? BuildConfig.FLAVOR : packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
                            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(createStringArrayList2, 10));
                            Iterator it = createStringArrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((AudioTrack) c10053e.ad.metrica((String) it.next()));
                            }
                            AbstractC3002e abstractC3002e = new AbstractC3002e(String.valueOf(arrayList.hashCode()), obj, arrayList);
                            c2464e.getClass();
                            C2464e.metrica(null, abstractC3002e);
                        } else {
                            VKXApplication vKXApplication2 = VKXApplication.f36528e;
                            Toast.makeText((Context) (vKXApplication2 != null ? vKXApplication2 : 0), "Нужно соединение с Интернетом!", 1).show();
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        int readInt2 = parcel.readInt();
                        int readInt3 = parcel.readInt();
                        String readString = parcel.readString();
                        if (((BinderC18041e) this).license.vip.startapp()) {
                            C10053e.vip(readInt2, readInt3, readString, new C17187e(i3));
                            Unit unit3 = Unit.INSTANCE;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        C10053e c10053e2 = ((BinderC18041e) this).license;
                        List<String> list = c10053e2.vip.startapp() ? (List) AbstractC5336e.yandex(C2693e.f6576e, new C16600e(c10053e2, r3, 11)) : C13664e.f27089e;
                        parcel2.writeNoException();
                        parcel2.writeStringList(list);
                        return true;
                    case 7:
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        C10053e c10053e3 = ((BinderC18041e) this).license;
                        C10312e c10312e = c10053e3.vip;
                        C1526e c1526e = new C1526e(c10053e3, readInt5, readInt4);
                        if (c10312e.startapp()) {
                            c1526e.invoke();
                        }
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        int readInt6 = parcel.readInt();
                        int readInt7 = parcel.readInt();
                        if (((BinderC18041e) this).license.vip.startapp()) {
                            long j = readInt7;
                            StringBuilder sb = new StringBuilder();
                            sb.append(j);
                            sb.append('_');
                            sb.append(readInt6);
                            String sb2 = sb.toString();
                            C4199e m4502e = C18353e.vip.m4502e();
                            if ((m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null) != null) {
                                i4 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i4);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo1402e(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo399e(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo399e(i, parcel, parcel2);
            case 4:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo687e(parcel, i);
        }
    }
}
