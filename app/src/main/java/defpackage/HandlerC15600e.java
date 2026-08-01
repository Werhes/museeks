package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC15600e extends Handler {
    public final /* synthetic */ int ad = 0;
    public WeakReference vip;

    public /* synthetic */ HandlerC15600e() {
    }

    public HandlerC15600e(C17527e c17527e) {
        this.vip = new WeakReference(c17527e);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7712e c7712e;
        switch (this.ad) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.vip.get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                C17527e c17527e = (C17527e) this.vip.get();
                if (c17527e != null) {
                    SparseArray sparseArray = c17527e.yandex;
                    ServiceConnectionC12367e serviceConnectionC12367e = c17527e.startapp;
                    ArrayList arrayList = serviceConnectionC12367e.f24800e;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    InterfaceC6380e interfaceC6380e = null;
                    InterfaceC6380e interfaceC6380e2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == c17527e.billing) {
                                c17527e.billing = 0;
                                if (serviceConnectionC12367e.f24797e == c17527e) {
                                    serviceConnectionC12367e.mopub();
                                }
                            }
                            if (((C11995e) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                C11995e.ad(null, null);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (c17527e.purchase == 0 && i3 == c17527e.billing && i4 >= 1) {
                                    c17527e.billing = 0;
                                    c17527e.purchase = i4;
                                    C13486e ad = C13486e.ad(bundle);
                                    if (serviceConnectionC12367e.f24797e == c17527e) {
                                        serviceConnectionC12367e.purchase(ad);
                                    }
                                    if (serviceConnectionC12367e.f24797e == c17527e) {
                                        serviceConnectionC12367e.f24798e = true;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((InterfaceC6380e) arrayList.get(i5)).vip(serviceConnectionC12367e.f24797e);
                                        }
                                        C13882e c13882e = serviceConnectionC12367e.f18727e;
                                        if (c13882e != null) {
                                            C17527e c17527e2 = serviceConnectionC12367e.f24797e;
                                            int i6 = c17527e2.license;
                                            c17527e2.license = i6 + 1;
                                            c17527e2.vip(10, i6, 0, c13882e.ad, null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                C11995e c11995e = (C11995e) sparseArray.get(i3);
                                if (c11995e != null) {
                                    sparseArray.remove(i3);
                                    c11995e.vip(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((C11995e) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    C11995e.ad(string, bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (c17527e.purchase != 0) {
                                    C13486e ad2 = C13486e.ad(bundle4);
                                    if (serviceConnectionC12367e.f24797e == c17527e) {
                                        serviceConnectionC12367e.purchase(ad2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                C11995e c11995e2 = (C11995e) sparseArray.get(i3);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    c11995e2.vip(bundle5);
                                    break;
                                } else {
                                    c11995e2.getClass();
                                    C11995e.ad("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (c17527e.purchase != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    C16289e c16289e = bundle7 != null ? new C16289e(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            c7712e = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            c7712e = new C7712e(bundle9 != null ? new C16289e(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(c7712e);
                                    }
                                    if (serviceConnectionC12367e.f24797e == c17527e) {
                                        Iterator it2 = arrayList.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                InterfaceC6380e interfaceC6380e3 = (InterfaceC6380e) it2.next();
                                                if (interfaceC6380e3.ad() == i4) {
                                                    interfaceC6380e2 = interfaceC6380e3;
                                                }
                                            }
                                        }
                                        if (interfaceC6380e2 instanceof C18267e) {
                                            ((C18267e) interfaceC6380e2).advert(c16289e, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (serviceConnectionC12367e.f24797e == c17527e) {
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        InterfaceC6380e interfaceC6380e4 = (InterfaceC6380e) it3.next();
                                        if (interfaceC6380e4.ad() == i4) {
                                            interfaceC6380e = interfaceC6380e4;
                                        }
                                    }
                                }
                                C2007e c2007e = serviceConnectionC12367e.f24799e;
                                if (c2007e != null && (interfaceC6380e instanceof AbstractC13922e)) {
                                    AbstractC13922e abstractC13922e = (AbstractC13922e) interfaceC6380e;
                                    C14090e c14090e = (C14090e) ((C0222e) c2007e.f5254e).license;
                                    if (c14090e.appmetrica == abstractC13922e) {
                                        c14090e.mopub(c14090e.metrica(), 2, true);
                                    }
                                }
                                if (interfaceC6380e != null) {
                                    arrayList.remove(interfaceC6380e);
                                    interfaceC6380e.metrica();
                                    serviceConnectionC12367e.advert();
                                    break;
                                }
                            }
                            break;
                    }
                    int i7 = ServiceConnectionC12367e.f24793e;
                    return;
                }
                return;
        }
    }
}
