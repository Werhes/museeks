package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC14522e extends Binder implements IInterface {
    public final Object license;
    public final /* synthetic */ int metrica = 1;

    public BinderC14522e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.license = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public BinderC14522e(C10053e c10053e) {
        attachInterface(this, "bruhcollective.itaysonlab.libvkx.ILibVkxService");
        this.license = c10053e;
    }

    public void adcel(int i, String[] strArr) {
        synchronized (((MultiInstanceInvalidationService) this.license).f592e) {
            try {
                String str = (String) ((MultiInstanceInvalidationService) this.license).f593e.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = ((MultiInstanceInvalidationService) this.license).f592e.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        Integer num = (Integer) ((MultiInstanceInvalidationService) this.license).f592e.getBroadcastCookie(i2);
                        int intValue = num.intValue();
                        String str2 = (String) ((MultiInstanceInvalidationService) this.license).f593e.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((C1897e) ((MultiInstanceInvalidationService) this.license).f592e.getBroadcastItem(i2)).adcel(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        ((MultiInstanceInvalidationService) this.license).f592e.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.metrica;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12, types: [eٟؓٙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ua.itaysonlab.vkxreborn.cache.realm.CachedTrack] */
    /* JADX WARN: Type inference failed for: r6v8, types: [eٟؓٙ, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C1897e c1897e = null;
        C1897e c1897e2 = null;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        switch (this.metrica) {
            case 0:
                C2693e c2693e = C2693e.f6576e;
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("bruhcollective.itaysonlab.libvkx.ILibVkxService");
                }
                if (i == 1598968902) {
                    parcel2.writeString("bruhcollective.itaysonlab.libvkx.ILibVkxService");
                    return true;
                }
                int i6 = 0;
                r5 = 0;
                int i7 = 0;
                switch (i) {
                    case 2:
                        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                        int readInt = parcel.readInt();
                        String readString = parcel.readString();
                        if (((C10053e) this.license).vip.startapp()) {
                            if (createStringArrayList.isEmpty()) {
                                Unit unit = Unit.INSTANCE;
                            } else {
                                VKXApplication vKXApplication = VKXApplication.f36528e;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                AbstractC5336e.purchase(vKXApplication, null, 0, new C0897e(createStringArrayList, readInt, readString, null), 3);
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        if (((C10053e) this.license).vip.startapp()) {
                            C14027e.ad.getClass();
                            i6 = (int) C14027e.metrica();
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i6);
                        return true;
                    case 4:
                        int readInt2 = parcel.readInt();
                        int readInt3 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (((C10053e) this.license).vip.startapp()) {
                            C10053e.vip(readInt3, readInt2, readString2, new C17187e(i3));
                            Unit unit3 = Unit.INSTANCE;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        C10053e c10053e = (C10053e) this.license;
                        C10312e c10312e = c10053e.vip;
                        C1526e c1526e = new C1526e(c10053e, readInt4, readInt5);
                        if (c10312e.startapp()) {
                            c1526e.invoke();
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        int readInt6 = parcel.readInt();
                        int readInt7 = parcel.readInt();
                        if (((C10053e) this.license).vip.startapp()) {
                            long j = readInt6;
                            StringBuilder sb = new StringBuilder();
                            sb.append(j);
                            sb.append('_');
                            sb.append(readInt7);
                            String sb2 = sb.toString();
                            C4199e m4502e = C18353e.vip.m4502e();
                            if ((m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null) != null) {
                                i7 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i7);
                        return true;
                    case 7:
                        C10053e c10053e2 = (C10053e) this.license;
                        List<String> list = c10053e2.vip.startapp() ? (List) AbstractC5336e.yandex(c2693e, new C16600e(c10053e2, r6, 11)) : C13664e.f27089e;
                        parcel2.writeNoException();
                        parcel2.writeStringList(list);
                        return true;
                    case 8:
                        int readInt8 = parcel.readInt();
                        int readInt9 = parcel.readInt();
                        String readString3 = parcel.readString();
                        if (((C10053e) this.license).vip.startapp()) {
                            C10053e.vip(readInt9, readInt8, readString3, new C2098e(1, C8416e.appmetrica, C8416e.class, "downloadTrack", "downloadTrack(Lua/itaysonlab/vkapi2/objects/music/AudioTrack;)V", 0, 0, 16));
                            Unit unit4 = Unit.INSTANCE;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        int readInt10 = parcel.readInt();
                        int readInt11 = parcel.readInt();
                        String readString4 = parcel.readString();
                        if (((C10053e) this.license).vip.startapp()) {
                            C10053e.ad(readInt11, readInt10, readString4, new C17187e(i5));
                            Unit unit5 = Unit.INSTANCE;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        int readInt12 = parcel.readInt();
                        int readInt13 = parcel.readInt();
                        String readString5 = parcel.readString();
                        if (((C10053e) this.license).vip.startapp()) {
                            C10053e.ad(readInt13, readInt12, readString5, new C17187e(i4));
                            Unit unit6 = Unit.INSTANCE;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        int readInt14 = parcel.readInt();
                        int readInt15 = parcel.readInt();
                        if (((C10053e) this.license).vip.startapp()) {
                            AbstractC5336e.startapp(new C15823e(readInt14, readInt15, r6, i5));
                            Unit unit7 = Unit.INSTANCE;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        String str = (String) AbstractC5336e.yandex(c2693e, new C15338e(i4, 5, r6));
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        return true;
                    case 13:
                        List<String> list2 = (List) AbstractC5336e.yandex(c2693e, new C5128e(Integer.parseInt(parcel.readString()), Integer.parseInt(parcel.readString()), AbstractC16704e.ad(VKXApplication.f36533e, AbstractC3820e.ad(AudioTrack.class)), null));
                        parcel2.writeNoException();
                        parcel2.writeStringList(list2);
                        return true;
                    case 14:
                        String str2 = (String) AbstractC5336e.yandex(c2693e, new C3595e(Integer.parseInt(parcel.readString()), Integer.parseInt(parcel.readString()), null));
                        parcel2.writeNoException();
                        parcel2.writeString(str2);
                        return true;
                    case 15:
                        int booleanValue = ((C10053e) this.license).vip.startapp() ? ((Boolean) AbstractC5336e.yandex(c2693e, new C15823e(parcel.readInt(), parcel.readInt(), r6, i6))).booleanValue() : 0;
                        parcel2.writeNoException();
                        parcel2.writeInt(booleanValue);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            default:
                if (i == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C1897e)) {
                            ?? obj = new Object();
                            obj.metrica = readStrongBinder;
                            c1897e2 = obj;
                        } else {
                            c1897e2 = (C1897e) queryLocalInterface;
                        }
                    }
                    int remoteconfig = remoteconfig(c1897e2, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(remoteconfig);
                    return true;
                }
                if (i != 2) {
                    if (i == 3) {
                        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                        adcel(parcel.readInt(), parcel.createStringArray());
                        return true;
                    }
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C1897e)) {
                        ?? obj2 = new Object();
                        obj2.metrica = readStrongBinder2;
                        c1897e = obj2;
                    } else {
                        c1897e = (C1897e) queryLocalInterface2;
                    }
                }
                int readInt16 = parcel.readInt();
                synchronized (((MultiInstanceInvalidationService) this.license).f592e) {
                    ((MultiInstanceInvalidationService) this.license).f592e.unregister(c1897e);
                    ((MultiInstanceInvalidationService) this.license).f593e.remove(Integer.valueOf(readInt16));
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public int remoteconfig(C1897e c1897e, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (((MultiInstanceInvalidationService) this.license).f592e) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.license;
                int i = multiInstanceInvalidationService.f595e + 1;
                multiInstanceInvalidationService.f595e = i;
                if (multiInstanceInvalidationService.f592e.register(c1897e, Integer.valueOf(i))) {
                    ((MultiInstanceInvalidationService) this.license).f593e.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.license;
                multiInstanceInvalidationService2.f595e--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
