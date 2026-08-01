package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14207e {
    public final String ad;
    public final boolean appmetrica;
    public final InterfaceC18198e billing;
    public final CarIcon license;
    public final C2730e metrica;
    public List purchase;
    public final CarText vip;
    public final ArrayList yandex;

    public C14207e(ConversationItem conversationItem) {
        this.ad = conversationItem.getId();
        this.vip = conversationItem.getTitle();
        this.metrica = conversationItem.getSelf();
        this.license = conversationItem.getIcon();
        this.appmetrica = conversationItem.isGroupConversation();
        this.billing = conversationItem.getConversationCallbackDelegate();
        this.purchase = conversationItem.getMessages();
        this.yandex = new ArrayList(conversationItem.getActions());
    }
}
