package defpackage;

import android.bluetooth.BluetoothDevice;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12276e extends AbstractC6762e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6484e f24612e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f24613e;

    public /* synthetic */ C12276e(AbstractC6484e abstractC6484e, int i) {
        this.f24613e = i;
        this.f24612e = abstractC6484e;
    }

    public C12276e(String str, C16062e c16062e) {
        this.f24613e = 7;
        this.f24612e = c16062e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [eؚٖۜ, java.lang.Object] */
    @Override // defpackage.InterfaceC10801e
    public final void ad(Object obj) {
        switch (this.f24613e) {
            case 0:
                C6719e c6719e = (C6719e) this.f24612e;
                ((AbstractC1346e) obj).vip(c6719e.f13882e, new C6524e(c6719e.f13880e, c6719e.f13884e));
                return;
            case 1:
                ((AbstractC1346e) obj).license(((C17470e) this.f24612e).f34219e);
                return;
            case 2:
                ((AbstractC1346e) obj).ad(((C5090e) this.f24612e).f10927e, new C6114e(24));
                return;
            case 3:
                C16942e c16942e = (C16942e) this.f24612e;
                c16942e.getClass();
                c16942e.getClass();
                c16942e.getClass();
                return;
            case 4:
                C15822e c15822e = (C15822e) this.f24612e;
                C17038e c17038e = (C17038e) obj;
                BluetoothDevice bluetoothDevice = c15822e.f31229e;
                String str = c15822e.f31230e;
                if (bluetoothDevice == null || !(str == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str))) {
                    c17038e.ad.f5159e.add(new C6571e(str, new C14346e(c15822e.f31227e)));
                    return;
                } else {
                    "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
                    c17038e.ad.f5159e.add(new C6571e("__UNRECOGNIZED_BLUETOOTH_DEVICE__", new C14346e("__UNRECOGNIZED_BLUETOOTH_DEVICE__")));
                    return;
                }
            case 5:
                AbstractC13480e.m3593new(((C17038e) obj).ad.f5159e, new C18513e(((C4552e) this.f24612e).f9837e, 4));
                return;
            case 6:
                ((C17157e) obj).ad(((C4318e) this.f24612e).f9429e);
                return;
            default:
                C16062e c16062e = (C16062e) this.f24612e;
                ?? obj2 = new Object();
                obj2.f31625e = c16062e.f31625e;
                obj2.f31622e = c16062e.f31622e;
                obj2.f31624e = c16062e.f31624e;
                obj2.f31623e = 2;
                ((C17157e) obj).ad(obj2);
                return;
        }
    }
}
